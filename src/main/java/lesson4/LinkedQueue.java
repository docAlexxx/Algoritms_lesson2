package lesson4;

public class LinkedQueue <T>{
        private MyLinkedList<T> list;

        public LinkedQueue() {
            list = new MyLinkedList<>();
        }

        public void insert(T item) {
            list.insertFirst(item);
        }

        public T remove() {
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