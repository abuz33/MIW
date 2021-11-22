package model;

public class FruitBasket extends Bag {
    public FruitBasket() {
        super();
    }

    public boolean contains(Object o) {
        return this.getItems().contains(o);
    }

}
