package com.tpointtech.collections.arraylist.simple;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MyArrayList implements Iterable<Integer> {
    private int[] arr;
    private int size;

    public MyArrayList(int initialCapacity) {
        this.arr = new int[initialCapacity];
        this.size = 0;
    }

    public MyArrayList() {
        this(16);
    }

    void add(int element) {
        add(size, element);
    }

    void add(int index, int element) {
        Objects.checkIndex(index, size + 1);
        if (size == arr.length)
            grow(1);

        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = element;

        size++;
    }

    void addAll(Collection<Integer> collection) {
        addAll(this.size, collection);
    }

    void addAll(int index, Collection<Integer> collection) {
        if (collection.size() > arr.length - size)
            grow(collection.size());

        System.arraycopy(arr, index, arr, index + collection.size(), size - index);

        for (Integer item : collection) {
            arr[index++] = item;
        }

        size += collection.size();
    }

    void clear() {
        Arrays.fill(arr, 0, size, 0);
        size = 0;
    }

    void ensureCapacity(int requiredCapacity) {
        grow(requiredCapacity);
    }

    int get(int index) {
        Objects.checkIndex(index, size);
        return arr[index];
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element)
                return true;
        }
        return false;
    }

    int remove(int index) {
        int el = arr[index];
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        size--;
        return el;
    }

    private void grow(int minGrowth) {
        int newSize = size + (size << 1) + 1;
        if (newSize < minGrowth + size)
            newSize = minGrowth + size;

        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor != size;
            }

            @Override
            public Integer next() {
                return arr[cursor++];
            }
        };
    }

    @Override
    public String toString() {
        Iterator<Integer> iterator = iterator();
        if (!iterator.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (; ; ) {
            sb.append(iterator.next());

            if (!iterator.hasNext()) {
                sb.append(']');
                break;
            }

            sb.append(',').append(' ');
        }

        return sb.toString();
    }
}
