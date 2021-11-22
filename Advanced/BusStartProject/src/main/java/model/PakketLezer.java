package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PakketLezer {

    public List<Pakket> leesPakketLijst(String bestandsnaam) {
        String regel;
        String[] regeldelen;
        Pakket resultPakket;
        List<Pakket> result = new ArrayList<>();
        File bestand = new File(bestandsnaam);
        try {
            Scanner bestandlezer = new Scanner(bestand);
            while (bestandlezer.hasNext()) {
                regel = bestandlezer.nextLine();
                regeldelen = regel.split("\\s");
                resultPakket = new Pakket(regeldelen[0], regeldelen[1], Integer.parseInt(regeldelen[2]));
                result.add(resultPakket);
            }
        } catch (FileNotFoundException leesfout) {
            System.out.println("Het bestand is niet gevonden");
        }
        return result;
    }
}
