package util;


public interface StackInter<E> {
    public void push(E item);

    public E pop();


    boolean isEmpty();

    public E peek();
}

class LinkedListStackImplementation<E> implements StackInter<E> {

    private class Node<E> {

        private E element;
        private Node<E> next;

        Node(E data, Node<E> next) {
            this.element = data;
            this.next = next;
        }

        public Node() {

        }
    }

    Node<E> first;

    @Override
    public void push(E x) {
        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.element = x;
        temp.next = first;
        first = temp;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public E peek() {
        if (!isEmpty()) {
            return first.element;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    @Override
    public E pop() {
        if (first == null) {
            System.out.print("\nStack Underflow");
            return null;
        }

        first = first.next;
        return null;
    }
}

