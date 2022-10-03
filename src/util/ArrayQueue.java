package util;

import java.util.ArrayList;

public class ArrayQueue<E> implements QueueInter<E> {

    private ArrayList<E> thisList = new ArrayList<>();

    public ArrayQueue() {
        this.thisList = new ArrayList<E>();
    }

    public ArrayList<E> getList() {
        return this.thisList;
    }

    @Override
    public void enqueue(E item) {
        thisList.add(item);
    }

    @Override // =====> O(n)
    public E dequeue() {
        E firstElement = peak();
        if (firstElement != null) {
            thisList.remove(0);
        }
        return firstElement;
    }

    @Override
    public E peak() {
        if (!isEmpty()) {
            return thisList.get(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return thisList.size() == 0;
    }
}
