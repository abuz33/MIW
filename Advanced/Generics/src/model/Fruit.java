package model;

public class Fruit {
    private int gewicht;

    public Fruit(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "gewicht=" + gewicht;
    }
}
