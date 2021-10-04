package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NamenBestandVerwerker {
    final static String URI = "/Users/macuser/Desktop/JavaProjects/MIW/OOP/NamenSorteren/src/resources/";

    public static int telNamenBestand(String bestandsnaam) {
        int aantalNamen = 0;

        try {
            File file = new File(URI + bestandsnaam);
            Scanner namen = new Scanner(file);
            while (namen.hasNext()) {
                namen.next();
                aantalNamen += 1;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file exist in \"resources\" folder. Check again.");
            return 0;
        }

        return aantalNamen;
    }

    public static ArrayList<String> leesNamenBestand(String bestandsnaam) {
        ArrayList<String> namen = new ArrayList<>();

        int aantalNamen = 0;

        try {
            File file = new File(URI + bestandsnaam);
            Scanner namen2 = new Scanner(file);
            while (namen2.hasNext()) {
                namen.add(namen2.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file exist in \"resources\" folder. Check again.");
        }
        return namen;
    }

    public static void voegNaamToeAanGesorteerdeLijst(String naam, ArrayList<String> lijst) {
        // int idx = 0;
        // while (naam.compareTo(lijst.get(idx)) > 0) {
        // idx++;
        //    if (idx >= lijst.size()) {
        //       lijst.add(idx, naam);
        //       return;
        //       }
        //    }
        //
        //    lijst.add(idx, naam);

        for (int i = 0; i < lijst.size(); i++) {
            if (naam.compareTo(lijst.get(i)) > 0) continue;
            lijst.add(i, naam);
            return;
        }
        lijst.add(naam);
    }

    public static void voegLijstToeAanGesorteerdeLijst(ArrayList<String> sorteerdeLijst, ArrayList<String> nieuweLijst) {
        for (String n : nieuweLijst) {
            voegNaamToeAanGesorteerdeLijst(n, sorteerdeLijst);
        }
    }

    public static void maakBestandVanLijst(ArrayList<String> lijst, String bestandsnaam) {
        File bestand = new File(URI + bestandsnaam);
        try {
            FileWriter fw = new FileWriter(bestand);
            for (String naam : lijst) {
                fw.write(naam + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
