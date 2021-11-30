package datastructures;

import java.util.List;

public interface Heap<I extends Comparable<I>> {

    public void addItem(I newItem);

    public void addListOfItems(List<I> list);

    public I removeItem();

    public int size();
}
