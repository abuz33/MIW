package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordMap {

    Map<String, Integer> wordmap = new HashMap<>();

    public WordMap() {
    }


    /**
     * Read words from file.
     *
     * @param filename name of the file
     */
    public void readFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {

            while (scanner.hasNext()) {
                String word = scanner.next();
                // Remove all non-alphanumerical characters.
                word = word.replaceAll("[^A-Za-z0-9-]", "");
                addWordToMap(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void addWordToMap(String word) {
        // In this method we are merging the word with the existing (if exist, adding one to the count)
        wordmap.merge(word, 1, Integer::sum);

        // Try to find the key in the map. If it does not exist, null will be returned
        //Integer cnt = wordmap.get(word);


        //// Check if the key existed or not
        //if (cnt == null) {
        // No, the key does not exist, we start with the value 1
        //   wordmap.put(word, 1);
        //} else {
        //   // Yes, word was already in the map, add 1 to it.
        // wordmap.put(word, cnt + 1);
        // }
    }

    /**
     * Return number of unique words in the set.
     *
     * @return number of words
     */
    public int getNrOfUniqueWords() {
        return wordmap.size();
    }


    /**
     * Returns the words in the set sorted alphabetically. The return is an Iterable.
     *
     * @return a list
     */
    public Iterable<String> getWordsSorted() {
        // Create a new list with the contents of the wordset
        List<String> list = new ArrayList<>(wordmap.keySet());

        // Now sort the list and return it, which is an Iterable.
        Collections.sort(list);

        return list;
    }

    /**
     * Get the number of times a word appeared.
     *
     * @param word word that repeated in the text
     * @return get the number of word that repeated in the text
     */
    public int getWordCount(String word) {
        Integer cnt = wordmap.get(word);

        if (cnt == null) return 0;
        else return cnt;
    }
}
