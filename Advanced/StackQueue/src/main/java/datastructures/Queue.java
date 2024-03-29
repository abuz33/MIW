package datastructures;

public interface Queue<E> {

    public void enqueue(E element);

    public E dequeue();

    public boolean isEmpty();

    public int size();
}
