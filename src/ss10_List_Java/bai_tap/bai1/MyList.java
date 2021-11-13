package ss10_List_Java.bai_tap.bai1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size += 1;
    }

    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        size -= 1;
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements,minCapacity);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i);
        }
        return (E) elements[i];
    }
}
