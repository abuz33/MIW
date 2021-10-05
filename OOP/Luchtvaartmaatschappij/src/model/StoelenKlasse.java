package model;

public class StoelenKlasse {
    private String naam;
    private int aantalStoelen;

    public StoelenKlasse(String naam, int aantalStoelen) {
        this.naam = naam;
        this.aantalStoelen = aantalStoelen;
    }

    public int getAantalStoelen() {
        return aantalStoelen;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "StoelenKlasse{" +
                "naam='" + naam + '\'' +
                ", aantalStoelen=" + aantalStoelen +
                '}';
    }
}
