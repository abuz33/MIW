package model;

import org.jetbrains.annotations.NotNull;

public class WinkelProduct implements Comparable<WinkelProduct> {
    private String naam;
    private int calorieenPerGram;
    private int verkoopHoeveelheidInGram;

    public WinkelProduct(String naam, int calorieenPerGram, int verkoopHoeveelheidInGram) {
        this.naam = naam;
        this.calorieenPerGram = calorieenPerGram;
        this.verkoopHoeveelheidInGram = verkoopHoeveelheidInGram;
    }

    public int getCalorieenPerGram() {
        return calorieenPerGram;
    }

    public int getVerkoopHoeveelheidInGram() {
        return verkoopHoeveelheidInGram;
    }

    public String getNaam() {
        return naam;
    }


    @Override
    public String toString() {
        return "WinkelProduct{" +
                "naam='" + naam + '\'' +
                ", calorieenPerGram=" + calorieenPerGram +
                ", verkoopHoeveelheidInGram=" + verkoopHoeveelheidInGram +
                '}';
    }

    @Override
    public int compareTo(@NotNull WinkelProduct o) {
        if (this.getNaam().compareTo(o.getNaam()) > 0) {
            return 1;
        } else if (this.getNaam().compareTo(o.getNaam()) < 0)
            return -1;
        return 0;
    }
}
