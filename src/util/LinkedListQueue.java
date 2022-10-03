package util;

import java.util.LinkedList;

public class LinkedListQueue<E> implements QueueInter<E> {
    private LinkedList<E> thisList;

    public LinkedListQueue() {
        thisList = new LinkedList<E>();
    }

    public LinkedList<E> getList() {
        return this.thisList;
    }

    @Override
    public void enqueue(E item) {
        thisList.add(item);
    }

    @Override
    public E dequeue() {
        E firstElement = thisList.removeFirst();
        return firstElement;
    }

    @Override
    public E peak() {
        return thisList.peek();
    }

    @Override
    public boolean isEmpty() {
        return thisList.isEmpty();
    }
}
