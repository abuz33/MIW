package database;

import model.Hond;
import model.Klant;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HondDAO extends AbstractDAO {

    public HondDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public Hond getHondById(String chipnr) {
        String sql = "Select * from hond where chipnr = ?";
        Hond hond = null;
        KlantDAO kdao = new KlantDAO(dBaccess);
        try {
            this.setupPreparedStatementWithKey(sql);

            this.preparedStatement.setString(1, chipnr);

            ResultSet rs = this.executeSelectStatement();
            if (rs.next()) {
                int klantnr = rs.getInt("klantnr");
                Klant klant = kdao.getKlantByID(klantnr);
                hond = new Hond(chipnr, rs.getString("hondnaam"), rs.getString("ras"), klant);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hond;
    }
}
