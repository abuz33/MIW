package nl.hva.miw.ads.mergesort;

public class LinkedList<I> {
    private Node first;
    private int size;

    public LinkedList() {
        first = null;
        size = 0;
    }

    public void add(I i) {
        Node item = new Node(i);
        item.next = first;
        first = item;
        size++;
    }


    public void addAtTail(I item) {
        if (this.first == null) add(item);
        else {
            Node i = new Node(item);
            Node n = first;
            while (n.next != null) {
                n = n.next;
            }
            n.next = i;
            size++;
        }
    }

    public void addAtMiddle(I item, int positie) {
        Node i = new Node(item);
        Node n = first;
        int s = positie - 1;
        while (s > 0 && n.next != null) {
            n = n.next;
            s++;
        }
        i.next = n.next;
        n.next = i;
        size++;
    }

    public I remove() {
        if (first == null) return null;
        Node n = first;
        if (first.next == null) {
            first = null;
        } else {
            first = first.next;
            n.next = null;
            size--;
        }
        return (I) n.item;
    }

    public I removeFromTail() {
        if (first == null) {
            return null;
        } else {
            Node current = first;
            int s = size;
            while (s > 1 && current.next != null) {
                current = current.next;
                s--;
            }
            Node toBeRemoved = current.next;
            current.next = null;
            return (I) toBeRemoved.item;
        }
    }

    public I removeFromMiddle(int index) {
        Node n = first;
        while (index > 0 && n.next != null) {
            n = n.next;
            index--;
        }
        Node res = n.next;
        n.next = res.next;
        res.next = null;

        return (I) res.item;
    }

    public class Node<I> {
        I item;
        Node next;

        public Node(I item) {
            this.item = item;
        }

    }
}
