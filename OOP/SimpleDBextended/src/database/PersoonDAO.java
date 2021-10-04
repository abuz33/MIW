package database;

import model.Persoon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersoonDAO extends AbstractDAO {


    public PersoonDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    /**
     *
     * "
     * methode zoekt personen gebaseerd op de opgegeven naam
     * @param name
     * @return
     */
    public List<Persoon> getPersonenByName(String name){
        List<Persoon> personen = new ArrayList<>();
        // check inputparameters op SQL injection, throw anders een IllegalArgumentException
        // TODO

        String sql = "SELECT * from PERSOON WHERE name=?";
        // mapping variabele sql velden en java
        try {
            // maak statement object
            setupPreparedStatement(sql);
            preparedStatement.setString(1,name);

        } catch (SQLException e) {
            e.printStackTrace();
        }


        // krijg een statement om uit te voeren van het connectionobject
        try {
              // voer query uit en ontvang resultaten.
            ResultSet resultSet = executeSelectStatement();
            //
            while (resultSet.next()) {
                String naam = resultSet.getString("name");
                int jaar = resultSet.getInt("birthyear");
                int maand = resultSet.getInt("birthmonth");
                // maak persoon object van de gegevens uit de resultset
                Persoon gelezenPersoon = new Persoon(naam, jaar, maand);
                // voeg toe aan list
                personen.add(gelezenPersoon);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // return
        return personen;


    }

    public List<Persoon> getAllPersonen() {
        List<Persoon> personen = new ArrayList<>();
        // open verbinding naar schema
        dBaccess.openConnection();
        // ophalen geopende connectie
        Connection connection = dBaccess.getConnection();

        // doe iets met queries om objecten op te halen
        String sql = "SELECT * FROM PERSOON";

        // krijg een statement om uit te voeren van het connectionobject
        try {
            // maak statement object
            Statement statement = connection.createStatement();
            // voer query uit en ontvang resultaten.
            ResultSet resultSet = statement.executeQuery(sql);
            //
            while (resultSet.next()) {
                String naam = resultSet.getString("name");
                int jaar = resultSet.getInt("birthyear");
                int maand = resultSet.getInt("birthmonth");
                // maak persoon object van de gegevens uit de resultset
                Persoon gelezenPersoon = new Persoon(naam, jaar, maand);
                // voeg toe aan list
                personen.add(gelezenPersoon);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // return
        return personen;
    }




}