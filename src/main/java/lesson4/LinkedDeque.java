package lesson4;

public class LinkedDeque<T> {
    private MyLinkedList<T> list;

    public LinkedDeque() {
        list = new MyLinkedList<>();
    }

    public void insertLeft(T item) {
        list.insertFirst(item);
    }

    public T removeLeft() {
        return list.removeFirst();
    }

    public void insertRight(T item) {
        list.insertLast(item);
    }

    public T removeRight() {
        return list.removeLast();
    }

    public T begin() { return list.getFirst(); }

    public T end() { return list.getLast(); }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
