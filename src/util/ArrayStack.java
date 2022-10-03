package util;

import java.util.ArrayList;

public class ArrayStack<E> implements StackInter<E> {
    private ArrayList<E> thisList = new ArrayList<>();

    public ArrayStack() {
        this.thisList = new ArrayList<>();
    }

    public ArrayList<E> getList() {
        return this.thisList;
    }

    @Override
    public void push(E item) {
        thisList.add(item);
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            return thisList.remove(thisList.size() - 1);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return thisList.size() == 0;
    }

    @Override
    public E peek() {
        return thisList.get(thisList.size() - 1);
    }
}
