package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        doWordSetTest();
//        doWordMapTest();
        doWordLineNrsTest();
    }

    private static void doWordSetTest() {
        System.out.println("WordSet Test");

        WordSet wordset = new WordSet();

        wordset.readFromFile("input.txt");

        System.out.println("The file has " + wordset.getNrOfUniqueWords() + " unique words. ");
        System.out.println("The words in alphabetical order are: ");

        for (String word : wordset.getWordsSorted()) {
            System.out.println(" " + word);
        }

        System.out.println();
        System.out.println();
    }

    private static void doWordMapTest() {
        System.out.println("WordMap Test");

        WordMap wordmap = new WordMap();

        wordmap.readFromFile("input.txt");

        System.out.println("The file has " + wordmap.getNrOfUniqueWords() + " unique words. ");
        System.out.println("The words in alphabetical order are: ");

        for (String word : wordmap.getWordsSorted()) {
            System.out.printf("  %-15s : %-3d\n", word, wordmap.getWordCount(word));
        }

        System.out.println();
        System.out.println();
    }

    private static void doWordLineNrsTest() {
        System.out.println("WordLineNrs Test");

        WordLinesMap wordmap = new WordLinesMap();

        wordmap.readFromFile("input.txt");

        System.out.println("The file has " + wordmap.getNrOfUniqueWords() + " unique words. ");
        System.out.println("The words in alphabetical order are: ");

        for (String word : wordmap.getWordsSorted()) {
            System.out.printf("  %-15s : [ ", word);

            for (int i : wordmap.getWordLineNrs(word)) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }

        System.out.println();
        System.out.println();
    }
}
