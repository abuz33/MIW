package database;

import model.StoelenKlasse;

import java.sql.SQLException;

public class StoelenDAO extends AbstractDAO {
    private String insertStoelenSql = "INSERT INTO `luchtvaart`.`StoelenKlasseIndeling`(`registratieNr`,`klasseNaam`,`aantalStoelen`)" +
            "VALUES(?,?,?);";

    public StoelenDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public int telStoel(int pk, StoelenKlasse sk) {
        int key = -1;

        try {
            this.setupPreparedStatementWithKey(this.insertStoelenSql);
            this.preparedStatement.setString(1, String.valueOf(pk));
            this.preparedStatement.setString(2, sk.getNaam());
            this.preparedStatement.setString(3, String.valueOf(sk.getAantalStoelen()));

            key = this.executeInsertStatementWithKey();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return key;
    }


}
