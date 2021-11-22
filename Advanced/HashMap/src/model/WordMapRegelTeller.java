package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordMapRegelTeller {
    Map<String, List<Integer>> woorden;

    public WordMapRegelTeller() {
        woorden = new HashMap<>();
    }

    public void readFromFile(String bestandNaam) {
        try (Scanner scanner = new Scanner(new File(bestandNaam))) {
            int line = 1;
            while (scanner.hasNextLine()) {
                String regel = scanner.nextLine();
                String[] words = regel.split("\\s+");
                processWords(line, words);
                line++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void processWords(int line, String[] words) {
        for (String woord : words) {
            woord = woord.replaceAll("[^A-Za-z0-9-]", "");
            if (woorden.containsKey(woord)) {
                woorden.get(woord).add(line);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(line);
                woorden.put(woord, temp);
            }
        }
    }

    public int getNrOfUniqueWords() {
        return woorden.keySet().size();
    }

    public Iterable<String> getWordsSorted() {
        return (Iterable<String>) woorden.keySet().stream().sorted();
    }

    public int getWordCount(String word) {
        return woorden.get(word).size();
    }

    public List<Integer> getRegels(String word) {
        return woorden.get(word);
    }

    public Map<String, List<Integer>> getWoorden() {
        return woorden;
    }

    public int getTotalNrOfWords() {
        int totaal = 0;
        for (List<Integer> i : woorden.values()) {
            totaal += i.size();
        }
        return totaal;
    }
}
