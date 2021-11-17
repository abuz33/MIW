package com.company;

import java.util.Scanner;

public class WordSet {
    Scanner scanner;

    public WordSet() {
    }

    public void readFromFile(String filenaam) {
        scanner = new Scanner(filenaam);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
