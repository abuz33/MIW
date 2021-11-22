package model;

import java.util.ArrayList;
import java.util.List;

public class BestelBus<I extends Weighable> {

    private String naam;
    private int totaalGewicht;
    private final int maximumGewicht;
    private final List<I> lading;

    public BestelBus(String naam, int maximumGewicht) {
        this.naam = naam;
        this.totaalGewicht = 0;
        this.maximumGewicht = maximumGewicht;
        this.lading = new ArrayList<>();
    }

    /**
     * @param pakket enter the pakket that is going to be sent
     * @should not add the package that weighs less than 0
     * @should not add the package that makes the bus over maximum kgs
     */
    public void laadPakket(I pakket) {
        if (pakket.getGewicht() >= 0 && totaalGewicht + pakket.getGewicht() < maximumGewicht) {
            lading.add(pakket);
            this.totaalGewicht += pakket.getGewicht();
        }
    }

    public List<I> getLading() {
        return lading;
    }

    public int getTotaalGewicht() {
        return totaalGewicht;
    }

    /**
     * @return I
     * @should return lightest package
     */
    public I zoekZwaarstePakket() {
        I pakket = lading.get(0);
        for (I p : lading) {
            if (p.getGewicht() < pakket.getGewicht()) pakket = p;
        }
        return pakket;
    }
}
