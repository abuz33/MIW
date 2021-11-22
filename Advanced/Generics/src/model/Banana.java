package model;

public class Banana extends Fruit {
    public Banana(int gewicht) {
        super(gewicht);
    }
    @Override
    public String toString() {
        return "Banana{"+super.toString()+"}";
    }
}
