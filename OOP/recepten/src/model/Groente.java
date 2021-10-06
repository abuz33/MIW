package model;

public class Groente extends Ingredient {

    public Groente(WinkelProduct winkelProduct, int hoeveelheidInGram) {
        super(winkelProduct, hoeveelheidInGram);
    }

    @Override
    public String toString() {
        return "Groente{" +
                "hoeveelheidInGram=" + hoeveelheidInGram +
                '}';
    }
}
