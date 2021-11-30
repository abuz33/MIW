package datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHeap<I extends Comparable<I>> implements Heap<I> {

    private List<I> contents;

    public ArrayListHeap() {
        contents = new ArrayList<>();
    }

    public ArrayListHeap(List<I> list) {
        this();
        this.addListOfItems(list);
    }

    @Override
    public void addItem(I newItem) {
        this.contents.add(newItem);
        if (size() > 1)
            this.swim(this.contents.size() - 1);
    }

    @Override
    public void addListOfItems(List<I> list) {
        for (I i : list) {
            this.addItem(i);
        }
    }


    @Override
    public I removeItem() {
        I item = contents.isEmpty() ? null : this.contents.remove(0);
        exchange(0, this.contents.size() - 1);
        sink(0);
        return item;
    }

    private void swim(int index) {
        while (index >= 1 && lessThan(parent(index), index)) {
            exchange(parent(index), index);
            index = parent(index);
        }
    }

    private void sink(int index) {
        while (left(index) <= this.contents.size()) {
            int older = left(index);
            if (right(index) <= this.contents.size() && lessThan(older, right(index))) {
                older = right(index);
            }

            if (lessThan(older, index)) break;

            exchange(index, older);
            index = older;
        }
    }

    private int parent(int idx) {
        return (idx - 1) / 2;
    }

    private int left(int idx) {
        return idx * 2 + 1;
    }

    private int right(int idx) {
        return idx * 2 + 2;
    }

    private void exchange(int index1, int index2) {
        I temp = this.contents.get(index1);
        this.contents.set(index1, this.contents.get(index2));
        this.contents.set(index2, temp);
    }

    private boolean lessThan(int index1, int index2) {
        return this.contents.get(index1).compareTo(this.contents.get(index2)) < 0;
    }

    public int size() {
        return contents.size();
    }

    public String toString() {
        return contents.toString();
    }
}
