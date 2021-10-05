package database;

import model.PersonenVliegTuig;
import model.Vliegtuig;
import model.VrachtVliegtuig;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VliegtuigDAO extends AbstractDAO {
    private final String insertSql = "INSERT INTO `luchtvaart`.`VliegtuigAll`(`regNr`,`vliegtuigType`," +
            "`maxLading`,`aantalStewards`,`isVrachtVliegtuig`,`isPersonenVliegtuig`)" +
            "VALUES(?,?,?,?,?,?);";

    public VliegtuigDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    private int storePersonenVliegtuig(PersonenVliegTuig pv) {
        int key = -1; // default value

        try {
            this.setupPreparedStatementWithKey(this.insertSql);
            //
            this.preparedStatement.setString(1, "" + (pv.getRegistratieNummer()));
            this.preparedStatement.setString(2, "" + pv.getType());
            this.preparedStatement.setString(3, "" + 0);
            this.preparedStatement.setString(4, "" + pv.getAantalPersoneel());
            this.preparedStatement.setString(5, "" + 0);
            this.preparedStatement.setString(6, "" + 1);
            //
            key = this.executeInsertStatementWithKey();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return key;
    }

    private int storeVrachtVliegtuig(VrachtVliegtuig v) {
        int key = -1; // default value

        try {
            this.setupPreparedStatementWithKey(insertSql);

            this.preparedStatement.setString(1, "" + (v.getRegistratieNummer()));
            this.preparedStatement.setString(2, "" + v.getType());
            this.preparedStatement.setString(3, "" + v.getMaxLading());
            this.preparedStatement.setString(4, "" + 0);
            this.preparedStatement.setString(5, "" + 1);
            this.preparedStatement.setString(6, "" + 0);

            key = this.executeInsertStatementWithKey();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return key;
    }

    public int storeVliegtuig(Vliegtuig v) {
        if (v instanceof PersonenVliegTuig) {
            return storePersonenVliegtuig((PersonenVliegTuig) v);
        } else return storeVrachtVliegtuig((VrachtVliegtuig) v);
    }
}
