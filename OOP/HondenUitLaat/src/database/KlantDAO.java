package database;

import model.Klant;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KlantDAO extends AbstractDAO {

    public KlantDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public Klant getKlantByID(int klantID) {
        String sql = "Select * from klant where klantnr = ?";
        Klant klant = null;
        try {
            this.setupPreparedStatementWithKey(sql);
            this.preparedStatement.setInt(1, klantID);

            ResultSet rs = this.executeSelectStatement();

            if (rs.next()) {
                String voorletters = rs.getString("voorletters");
                String voorvoegsels = rs.getString("voorvoegsels");
                String achternaam = rs.getString("achternaam");
                String phone = rs.getString("telefoon");

                klant = new Klant(klantID, voorletters, voorvoegsels, achternaam, phone);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return klant;
    }

    ;
}
