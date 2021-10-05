package controller;

import database.DBaccess;
import database.StoelenDAO;
import database.VliegtuigDAO;
import model.PersonenVliegTuig;
import model.StoelenKlasse;
import model.Vliegtuig;
import model.VrachtVliegtuig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Users/macuser/Desktop/JavaProjects/MIW/OOP/Luchtvaartmaatschappij/resources/Vliegtuigen.csv");
        ArrayList<PersonenVliegTuig> personenVliegTuigs = new ArrayList<>();
        ArrayList<StoelenKlasse> stoelenKlassen = new ArrayList<>();

        ArrayList<Object> vliegtuigen = new ArrayList<>();

        try {
            String type = "";
            Scanner vliegtuig = new Scanner(file);
            while (vliegtuig.hasNextLine()) {
                String line = vliegtuig.nextLine();
                switch (line) {
                    case "Vrachtvliegtuigen" -> {
                        type = "Vrachtvliegtuigen";
                        continue;
                    }
                    case "Personenvliegtuigen" -> {
                        type = "Personenvliegtuigen";
                        continue;
                    }
                    case "Stoelindeling" -> {
                        type = "Stoelindeling";
                        continue;
                    }
                }

                switch (type) {
                    case "Vrachtvliegtuigen" -> {
                        String[] infos = line.split(", ");
                        VrachtVliegtuig vrachtVliegtuig = new VrachtVliegtuig(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
                        vliegtuigen.add(vrachtVliegtuig);
                    }
                    case "Personenvliegtuigen" -> {
                        String[] infos = line.split(", ");
                        PersonenVliegTuig personenVliegTuig = new PersonenVliegTuig(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
                        vliegtuigen.add(personenVliegTuig);
                        personenVliegTuigs.add(personenVliegTuig);
                    }
                    case "Stoelindeling" -> {
                        String[] infos = line.split(", ");
                        for (PersonenVliegTuig pv : personenVliegTuigs) {
                            if (pv.getRegistratieNummer() == Integer.parseInt(infos[0])) {
                                StoelenKlasse stoelenKlasse = new StoelenKlasse(infos[1], Integer.parseInt(infos[2]));
                                pv.addIndeling(stoelenKlasse);
                                stoelenKlassen.add(stoelenKlasse);
                            }
                        }
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + type);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        DBaccess dBaccess = new DBaccess("luchtvaart", "userLuchtvaart", "userLuchtvaartPW");
        dBaccess.openConnection();

        StoelenDAO stoelenDAO = new StoelenDAO(dBaccess);
        VliegtuigDAO vliegtuigDAO = new VliegtuigDAO(dBaccess);

        for (Object v : vliegtuigen) {
            vliegtuigDAO.storeVliegtuig((Vliegtuig) v);
            if (v instanceof PersonenVliegTuig) {
                for (StoelenKlasse sk : ((PersonenVliegTuig) v).getIndeling()) {
                    stoelenDAO.telStoel(((PersonenVliegTuig) v).getRegistratieNummer(), sk);
                }
            }
        }

        dBaccess.closeConnection();

    }
}
