package controller;

import basket.FruitBasket;
import model.Apple;
import model.Fruit;
import model.Pear;

import java.util.ArrayList;
import java.util.List;


public class Launcher {

  private Launcher() {
    super();
  }

  public static void main(String[] args) {
    Launcher launcher = new Launcher();
    launcher.makeItWork();
  }

  private void makeItWork() {
    FruitBasket<Fruit> basket = new FruitBasket<>();
    basket.add(new Apple());
    basket.add(new Pear());
    basket.add(new Apple());

    FruitBasket<Fruit> basket2 = new FruitBasket<>();
    basket2.add(new Apple());
    basket2.add(new Apple());
    basket2.add(new Apple());

    if (basket.equals(basket2)) {
      System.out.println("Joepie! Lunchtijd...");
    } else {
      System.out.println("Helaas...");
    }
  }
}