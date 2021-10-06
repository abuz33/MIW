package model;

public class Ingredient {
    private WinkelProduct winkelProduct;
    protected int hoeveelheidInGram;

    public Ingredient(WinkelProduct winkelProduct, int hoeveelheidInGram) {
        this.winkelProduct = winkelProduct;
        this.hoeveelheidInGram = hoeveelheidInGram;
    }

    public int geefCalorieen() {
        return -1;
    }

    public int geefBereidingstijdInMinuten() {
        return 1;
    }

    public WinkelProduct getWinkelProduct() {
        return winkelProduct;
    }
}
