package ArrayList;

public class ArrList {
    private int size = 0;
    private int[] elements = new int[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        this.elements[size++] = element;
    }

    public int remove() {
        if (size == 0) throw new IllegalArgumentException("Index out of bound");
        return elements[--size];
    }

    public int size() {
        return size;
    }

    public void add(int element, int index) {
        this.elements[size++] = element;
    }

    public int get(int index) {
        return elements[index];
    }
}
