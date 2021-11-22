package controller;

import model.WordLezer;
import model.WordMap;

public class WoordLauncher {
    public static void main(String[] args) {
        WordMap wordMap = new WordMap();
        WordLezer wordLezer = new WordLezer();
        wordLezer.leesWoordeLijst("src/main/resources/file.txt", wordMap);
        for (String key : wordMap.getWoorden().keySet()) {
            System.out.printf("Woord: %-21s \tValue: %3s\n", key, wordMap.getWoorden().get(key));
        }
    }
}
