package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordLezer {
    public void leesWoordeLijst(String bestandsnaam, WordMap wordMap) {
        File bestand = new File(bestandsnaam);
        try {
            Scanner bestandlezer = new Scanner(bestand);
            while (bestandlezer.hasNext()) {
                String word = bestandlezer.next().replaceAll("[-+.^:,“]","");
                wordMap.addWoord(word);
            }
        } catch (FileNotFoundException leesfout) {
            System.out.println("Het bestand is niet gevonden");
        }
    }
}
