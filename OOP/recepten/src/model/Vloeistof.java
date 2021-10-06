package model;

public class Vloeistof extends Ingredient {
    private double volumeInCm3;

    public Vloeistof(WinkelProduct winkelProduct, int hoeveelheidInGram, double volumeInCm3) {
        super(winkelProduct, hoeveelheidInGram);
        this.volumeInCm3 = volumeInCm3;
    }
}
