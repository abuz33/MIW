package datastructures;

public class HeapPriorityQueue<I extends Comparable<I>> implements PriorityQueue<I> {

    private Heap<I> contents;

    public HeapPriorityQueue() {
        contents = new ArrayListHeap<>();
    }

    @Override
    public void enqueue(I newItem) {
        contents.addItem(newItem);
    }

    @Override
    public I dequeue() {
        return contents.removeItem();
    }

    public int size() {
        return contents.size();
    }
}
