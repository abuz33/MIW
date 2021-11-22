package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMap {
    private Map<String, Integer> woorden;

    public WordMap() {
        woorden = new HashMap<>();
    }

    public void readFromFile(String bestandNaam) {
        try (Scanner scanner = new Scanner(new File(bestandNaam))) {
            while (scanner.hasNext()) {
                woorden.merge(scanner.next(), 1, Integer::sum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getNrOfUniqueWords() {
        return woorden.keySet().size();
    }

    public Iterable<String> getWordsSorted() {
        return (Iterable<String>) woorden.keySet().stream().sorted();
    }

    public int getWordCount(String word) {
        return woorden.get(word);
    }

    public Map<String, Integer> getWoorden() {
        return woorden;
    }
}
