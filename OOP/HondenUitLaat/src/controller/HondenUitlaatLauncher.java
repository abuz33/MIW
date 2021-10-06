package controller;

import database.DBaccess;
import database.MedewerkerDAO;
import database.WandelingDAO;
import model.Medewerker;
import model.Wandeling;

import java.util.ArrayList;

public class HondenUitlaatLauncher {

    public static void main(String[] args) {

        DBaccess dBaccess = new DBaccess("UitlaatService", "userUitlaatService", "pwUitlaatService");
        dBaccess.openConnection();

        WandelingDAO wandelingDAO = new WandelingDAO(dBaccess);
        MedewerkerDAO medewerkerDAO = new MedewerkerDAO(dBaccess);

        Medewerker medewerker = medewerkerDAO.getMedewerkerById("MR");

        System.out.println(medewerker);
        ArrayList<Wandeling> wandelings = wandelingDAO.getWandelingByMedewerker(medewerker);

        for (Wandeling w : wandelings) {
            System.out.println(w);
        }
        dBaccess.closeConnection();
    }
}
