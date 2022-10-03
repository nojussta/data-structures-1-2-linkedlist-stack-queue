package inter;


public interface StackInter<E> {
    public void push(E item);

    public E pop();


    boolean isEmpty();

    public E peak();
}

