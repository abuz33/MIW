package model;

public class Cirkel {
    public int straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }
}
