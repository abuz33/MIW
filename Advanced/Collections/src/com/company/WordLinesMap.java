package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordLinesMap {

    Map<String, List<Integer>> wordMap = new HashMap<>();

    public WordLinesMap() {
    }


    /**
     * Read words from file.
     *
     * @param filename name of the file
     */
    public void readFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            int lineNr = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNr++;
                processLine(line, lineNr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void processLine(String line, int lineNr) {
        for (String word : line.split("\\s+")) {
            // Remove all non-alphanumerical characters.
            word = word.replaceAll("[^A-Za-z0-9-]", "");

            addWordToMap(word, lineNr);
        }
    }

    private void addWordToMap(String word, int lineNr) {

        // Try to find the key in the map. If it does not exist, null will be returned
        List<Integer> l = wordMap.computeIfAbsent(word, k -> new ArrayList<>());

        // Check if the key existed or not
        // No, the key does not exist, we start with the value 1
        // List<Integer> l = wordmap.get(word);
        //// Check if the key existed or not
        //if (l == null) {
        //   // No, the key does not exist, we start with the value 1
        // l = new ArrayList<>();
        // wordmap.put(word, l);
        //}


        l.add(lineNr);
    }

    /**
     * Return number of unique words in the set.
     *
     * @return get number of unique words
     */
    public int getNrOfUniqueWords() {
        return wordMap.size();
    }


    /**
     * Returns the words in the set sorted alphabetically. The return is an Iterable.
     *
     * @return get list of sorted words
     */
    public Iterable<String> getWordsSorted() {
        // Create a new list with the contents of the wordset
        List<String> list = new ArrayList<>(wordMap.keySet());

        // Now sort the list and return it, which is an Iterable.
        Collections.sort(list);

        return list;
    }

    /**
     * Get the linenrs where a word appeared.
     *
     * @param word word that need to be found
     * @return list of lines
     */
    public List<Integer> getWordLineNrs(String word) {
        return wordMap.get(word);
    }
}
