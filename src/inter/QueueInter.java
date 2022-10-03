package inter;

public interface QueueInter<E> {
    void enqueue(E item);

    E dequeue();

    E peak();

    boolean isEmpty();
}

