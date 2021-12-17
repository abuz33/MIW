package patterns.facade;

import java.util.HashMap;
import java.util.Map;

public class Tuner {
    private Map<Integer, Integer> stationsNummerNaarFrequentie = new HashMap<>();
    private int currentFrequentie;

    public void switchOn() {

    }


    public void switchOff() {

    }

    public int getFrequentieInHz() {
        return 93424256;
    }

    public void gaNaarStation(int nummer) {
        this.currentFrequentie = this.stationsNummerNaarFrequentie.get(nummer);
    }

}


