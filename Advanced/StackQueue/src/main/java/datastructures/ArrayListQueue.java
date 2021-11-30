package datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<E> implements Queue<E> {

    private List<E> contents;

    public ArrayListQueue() {
        super();
        contents = new ArrayList<>();
    }

    public void enqueue(E element) {
        this.contents.add(element);
    }

    public E dequeue() {
        return !isEmpty() ? this.contents.remove(0) : null;
    }

    public boolean isEmpty() {
        return this.contents.isEmpty();
    }

    @Override
    public int size() {
        return contents.size();
    }
}
