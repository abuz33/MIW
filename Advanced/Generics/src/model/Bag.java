package model;

import java.util.ArrayList;
import java.util.List;

public class Bag<I> {
    private List<I> items;
    public Bag() {items = new ArrayList<I>();}
    public void add(I item) {items.add(item);}
    public boolean isEmpty() {return items.isEmpty();}
    public int size() {return items.size();}

    public List<I> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "items=" + items +
                '}';
    }
}
