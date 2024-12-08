package geometry;

public class LinkedList<T> {
    private java.util.LinkedList<T> list;

    public LinkedList() {
        list = new java.util.LinkedList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public void remove(T item) {
        list.remove(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void print() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
