package model;

public class Apple extends Fruit {
    public Apple(int gewicht) {super(gewicht);}

    @Override
    public String toString() {
        return "Apple{"+super.toString()+"}";
    }
}
