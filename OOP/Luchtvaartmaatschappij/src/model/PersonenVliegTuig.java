package model;

import java.util.ArrayList;

public class PersonenVliegTuig extends Vliegtuig {
    private int aantalPersoneel;
    private ArrayList<StoelenKlasse> indeling;

    public PersonenVliegTuig(int registratieNummer, String type, int aantalPersoneel) {
        super(registratieNummer, type);
        this.aantalPersoneel = aantalPersoneel;
        this.indeling = new ArrayList<>();
    }

    public void addIndeling(StoelenKlasse aantalPerKlasse) {
        this.indeling.add(aantalPerKlasse);
    }

    public int getTotaalStoelen() {
        int aantalStoelen = 0;
        for (StoelenKlasse s : this.indeling) {
            aantalStoelen += s.getAantalStoelen();
        }
        return aantalStoelen;
    }

    public int getAantalPersoneel() {
        return aantalPersoneel;
    }

    public ArrayList<StoelenKlasse> getIndeling() {
        return indeling;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPersonenVliegTuig{" +
                "aantalPersoneel=" + aantalPersoneel +
                ", indeling=" + indeling +
                '}';
    }
}
