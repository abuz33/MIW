package database;

import model.Hond;
import model.Medewerker;
import model.Wandeling;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class WandelingDAO extends AbstractDAO {
    private final String INSERT_SQL = "INSERT INTO `UitlaatService`.`Wandeling`(`chipnr`,`datum`,`duur`,`medewerkercode`)\n" +
            "VALUES(?,?,?,?);";
    private DBaccess db;

    public WandelingDAO(DBaccess dBaccess) {
        super(dBaccess);
        this.db = dBaccess;
    }

    public int storeWandeling(Wandeling mpWandeling) {
        int key = -1;
        try {
            setupPreparedStatementWithKey(this.INSERT_SQL);

            this.preparedStatement.setString(1, mpWandeling.getWalkHond().getChipnummer());
            this.preparedStatement.setString(2, String.valueOf(mpWandeling.getWalkDate()));
            this.preparedStatement.setDouble(3, mpWandeling.getDuur());
            this.preparedStatement.setString(4, mpWandeling.getWalkMedewerker().getMedewerkerNummer());

            key = this.executeInsertStatementWithKey();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return key;
    }

    public Wandeling getWandelingByHondDatum(Hond mpHond, LocalDate mpDatum) {
        String sql = "Select * from Wandeling where chipnr = ? And datum = ?";
        MedewerkerDAO mvdao = new MedewerkerDAO(db);
        Wandeling result = null;
        try {
            this.setupPreparedStatementWithKey(sql);

            this.preparedStatement.setString(1, mpHond.getChipnummer());
            this.preparedStatement.setString(2, String.valueOf(mpDatum));

            ResultSet rs = this.executeSelectStatement();

            if (rs.next()) {
                double duur = rs.getDouble("duur");
                Medewerker wandMedeWerker = mvdao.getMedewerkerById(rs.getString("medewerkercode"));
                result = new Wandeling(mpHond, mpDatum, duur, wandMedeWerker);
            } else {
                System.out.println("Hond " + mpHond + " is op " + mpDatum + " niet uitgelaten");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public ArrayList<Wandeling> getWandelingByMedewerker(Medewerker mpMedewerker) {
        String sql = "Select chipnr, duur, datum from wandeling where medewerkercode = ?";
        ArrayList<Wandeling> wands = new ArrayList<>();
        HondDAO hdao = new HondDAO(db);
        try {
            this.setupPreparedStatementWithKey(sql);

            this.preparedStatement.setString(1, mpMedewerker.getMedewerkerNummer());

            ResultSet rs = this.executeSelectStatement();
            while (rs.next()) {
                double duur = rs.getDouble("duur");
                LocalDate date = LocalDate.parse(rs.getString("datum"));
                Hond walkHond = hdao.getHondById(rs.getString("chipnr"));
                wands.add(new Wandeling(walkHond, date, duur, mpMedewerker));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wands;
    }
}
