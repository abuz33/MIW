package model;

public abstract class Voertuig extends Vervoermiddel {
    private int aantalWielen;
    private int gewicht;

    protected Voertuig(String merk, String type, int aantalWielen, int gewicht) {
        super(merk, type);
        this.aantalWielen = aantalWielen;
        this.gewicht = gewicht;
    }
}
