// Created by huub
// Creation date 2020-06-30

package basket;

public abstract class Bag<I> {

  public Bag() {
    super();
  }

  abstract void add(I item);

  abstract int size();

  public boolean isEmpty() {
    return size() == 0;
  }
}
