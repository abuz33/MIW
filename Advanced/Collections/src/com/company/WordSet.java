package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * WordSet class. Read text and count the number of different words.
 * <p>
 * Author: M. Oey.
 */

public class WordSet {

    Set<String> wordset = new HashSet<>();

    public WordSet() {
    }


    /**
     * Read words from file.
     *
     * @param filename
     */
    public void readFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                // Remove all non-alphanumerical characters.
                word = word.replaceAll("[^A-Za-z0-9-]", "");
                wordset.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return number of unique words in the set.
     *
     * @return
     */
    public int getNrOfUniqueWords() {
        return wordset.size();
    }


    /**
     * Returns the words in the set sorted alphabetically. The return is an Iterable.
     *
     * @return
     */
    public Iterable<String> getWordsSorted() {
        // Create a new list with the contents of the wordset
        List<String> list = new ArrayList<>(wordset);

        // Now sort the list and return it, which is an Iterable.
        Collections.sort(list);

        return list;
    }
}