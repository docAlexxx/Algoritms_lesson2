package Lesson3;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;
    private String direction;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index, String direction) {
        if (direction == "toRight") {
            return (index + 1) % list.length;
        } else if (index == 0) {
            return (list.length - 1);
        } else {
            return (index - 1) % list.length;
        }
    }

    public T peekFront(String direction) {
        if (isEmpty()) {
            throw new RuntimeException("Dequeue isEmpty");
        }

        if (direction == "toRight") {
            return list[begin];
        } else
            return list[end];
    }

    public void insertRight(T item) {
        if (isFull()) {
            //Расширение массива***
            throw new RuntimeException("Dequeue isFull");
        }
        size++;
        list[end] = item;
        end = nextIndex(end, "toRight");
    }

    public void insertLeft(T item) {
        if (isFull()) {
            //Расширение массива***
            throw new RuntimeException("Dequeue isFull");
        }
        size++;
        begin = nextIndex(begin, "toLeft");
        list[begin] = item;

    }

    public T removeLeft() {
        T temp = peekFront("toRight");
        size--;
        list[begin] = null;
        begin = nextIndex(begin, "toRight");
        return temp;
    }

    public T removeRight() {
        end = nextIndex(end, "toLeft");
        T temp = peekFront("toLeft");
        size--;
        list[end] = null;

        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public T get(int index) {
        //check index
        if (index < 0 || index > list.length - 1) {
            throw new IllegalArgumentException("index out of array range!");
        }

        return list[index];
    }
}
