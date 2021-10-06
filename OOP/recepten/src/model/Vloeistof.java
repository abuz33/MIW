package model;

public class Vloeistof extends Ingredient {
    private double volumeInCm3;

    public Vloeistof(WinkelProduct winkelProduct, double volumeInCm3) {
        super(winkelProduct, (int) (1.1 * volumeInCm3));
        this.volumeInCm3 = volumeInCm3;
    }

    @Override
    public String toString() {
        return "Vloeistof{" +
                "hoeveelheidInGram=" + hoeveelheidInGram +
                ", volumeInCm3=" + volumeInCm3 +
                '}';
    }
}
