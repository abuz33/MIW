package model;

public class Cirkel {
    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben. ";
    }

    public Cirkel(double straal) {
        this.straal = straal;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "wit";
    }

    public Cirkel() {
        this.straal = 1;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "wit";
    }

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }
}
