package model.Auto;

public abstract class Voertuig extends Vervoermiddel {
    private int aantalWielen;
    private int gewicht;

    protected Voertuig(String merk, String type, int aantalWielen, int gewicht) {
        super(merk, type);
        this.aantalWielen = aantalWielen;
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }
}
