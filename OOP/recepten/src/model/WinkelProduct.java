package model;

public class WinkelProduct implements Comparable {
    private String naam;
    private int calorieenPerGram;
    private int verkoopHoeveelheidInGram;

    public WinkelProduct(String naam, int calorieenPerGram, int verkoopHoeveelheidInGram) {
        this.naam = naam;
        this.calorieenPerGram = calorieenPerGram;
        this.verkoopHoeveelheidInGram = verkoopHoeveelheidInGram;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
