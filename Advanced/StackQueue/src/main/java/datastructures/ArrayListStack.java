package datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<E> implements Stack<E> {

    private List<E> contents;

    public ArrayListStack() {
        super();
        contents = new ArrayList<>();
    }

    public void push(E e) {
        this.contents.add(e);
    }

    public E pop() {
        return !isEmpty() ? this.contents.remove(this.contents.size() - 1) : null;
    }

    @Override
    public boolean isEmpty() {
        return this.contents.isEmpty();
    }

    @Override
    public int size() {
        return contents.size();
    }
}
