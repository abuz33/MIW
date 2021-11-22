package model;

public class Pear extends Fruit {
    public Pear(int gewicht) {
        super(gewicht);
    }
    @Override
    public String toString() {
        return "Pear{"+super.toString()+"}";
    }
}
