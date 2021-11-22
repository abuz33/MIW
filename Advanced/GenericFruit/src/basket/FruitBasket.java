// Created by huub
// Creation date 2020-06-30

package basket;

import model.Apple;
import model.Fruit;

import java.util.ArrayList;

public class FruitBasket<E extends Fruit> extends Bag<E> {

  private ArrayList<E> basket;

  public FruitBasket() {
    super();
    basket = new ArrayList<>();
  }

  @Override
  public void add(E fruit) {
    basket.add(fruit);
  }

  @Override
  public int size() {
    return basket.size();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    FruitBasket<E> that = (FruitBasket<E>) o;
    int myAppleCount = this.countApples();
    int otherAppleCount = that.countApples();
    return myAppleCount == otherAppleCount;
  }

  private int countApples() {
    int count = 0;
    for (Fruit fruit: basket) {
      if (fruit instanceof Apple) {
        count++;
      }
    }
    return count;
  }
}
