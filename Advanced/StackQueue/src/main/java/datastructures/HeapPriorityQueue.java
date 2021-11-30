package datastructures;

public class HeapPriorityQueue<I extends Comparable<I>> implements PriorityQueue<I> {

    private Heap<I> contents;

    public HeapPriorityQueue() {
        contents = new ArrayListHeap<>();
    }

    @Override
    public void enqueue(I newItem) {
        // TODO: Implementeer deze methode
    }

    @Override
    public I dequeue() {
        // TODO: Implementeer deze methode
        return null;
    }

    public int size() {
        return contents.size();
    }
}
