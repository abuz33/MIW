package datastructures;


public interface PriorityQueue<I extends Comparable<I>> {

    public void enqueue(I newItem);

    public I dequeue();


}
