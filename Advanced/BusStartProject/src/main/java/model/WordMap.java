package model;

import java.util.HashMap;
import java.util.Map;

public class WordMap {
    private Map<String, Integer> woorden;

    public WordMap() {
        woorden = new HashMap<>();
    }

    public void addWoord(String woord) {
        woorden.merge(woord, 1, Integer::sum);
    }

    public Map<String, Integer> getWoorden() {
        return woorden;
    }
}
