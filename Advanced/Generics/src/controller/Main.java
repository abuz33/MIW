package controller;

import model.Apple;
import model.Banana;
import model.FruitBasket;
import model.Pear;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FruitBasket fruitBasket = new FruitBasket();

        Apple apple1 = new Apple(2);
        Apple apple2 = new Apple(3);
        Banana banana1 = new Banana(3);
        Pear pear1 = new Pear(4);

        fruitBasket.add(apple1);
        fruitBasket.add(banana1);
        fruitBasket.add(pear1);

        System.out.println(fruitBasket.contains(apple1));
        System.out.println(fruitBasket.contains(apple2));
        System.out.println(fruitBasket);
    }
}
