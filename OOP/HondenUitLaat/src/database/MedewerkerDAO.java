package database;

import model.Medewerker;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedewerkerDAO extends AbstractDAO {
    private final String INSERT_SQL = "INSERT INTO `UitlaatService`.`Medewerker` (`medewerkercode`,`medewerkernaam`) " +
            "VALUES (?, ?);";
    private final String GET_SQL = "SELECT * FROM UitlaatService.Medewerker where medewerkercode = \"?\";";

    public MedewerkerDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public int storeMedewerker(Medewerker mpMedewerker) {
        int key = -1;
        try {
            this.setupPreparedStatementWithKey(this.INSERT_SQL);

            this.preparedStatement.setString(1, mpMedewerker.getMedewerkerNummer());
            this.preparedStatement.setString(2, mpMedewerker.getMedewerkerNaam());

            key = this.executeInsertStatementWithKey();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return key;
    }

    public Medewerker getMedewerkerById(String mpCode) {
        Medewerker medewerker = null;
        try {
            this.setupPreparedStatementWithKey(this.GET_SQL);

            this.preparedStatement.setString(1, mpCode);

            ResultSet rs = this.executeSelectStatement();

            medewerker = new Medewerker(rs.getString(1), rs.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medewerker;
    }
}
