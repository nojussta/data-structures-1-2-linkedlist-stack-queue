package util;

import java.util.LinkedList;

public class LinkedListStack<E> implements StackInter<E> {
    private LinkedList<E> thisList = new LinkedList<E>();

    public LinkedListStack() {
        this.thisList = new LinkedList<>();
    }

    public LinkedList<E> getList() {
        return this.thisList;
    }

    @Override
    public E pop() {
        E removedElement = thisList.pop();
        return removedElement;
    }

    @Override
    public void push(E item) {
        thisList.push(item);
    }

    @Override
    public E peek() {
        return thisList.peekFirst();
    }

    @Override
    public boolean isEmpty() {
        return thisList.isEmpty();
    }
}
