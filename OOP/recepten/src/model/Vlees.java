package model;

public class Vlees extends Ingredient {
    private int aantalStukjes;

    public Vlees(WinkelProduct winkelProduct, int hoeveelheidInGram, int aantalStukjes) {
        super(winkelProduct, hoeveelheidInGram);
        this.aantalStukjes = aantalStukjes;
    }
}

