package com.tpointtech.collections.arraylist;

import java.util.*;

public class MyArrayList implements Iterable<Integer> {
    private int[] arr;
    private int size;

    public MyArrayList() {
        this(16);
    }

    public MyArrayList(int initialCapacity) {
        this.arr = new int[initialCapacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int el) {
        for (int i = 0; i < size; i++)
            if (arr[i] == el)
                return true;

        return false;
    }

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

    public int[] toArray() {
        return Arrays.copyOf(arr, size);
    }

    public boolean add(int el) {
        if (size == arr.length)
            grow(size + 1);

        arr[size++] = el;
        return true;
    }

    private void grow(int minCapacity) {
        int newSize = Math.max(minCapacity, size + (size << 1) + 1);
        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    public boolean remove(int index) {
        Objects.checkIndex(index, size);
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        size--;
        return true;
    }

    public boolean containsAll(Collection<Integer> c) {
        for (Integer el : c)
            if (!contains(el))
                return false;

        return true;
    }

    public boolean addAll(int[] c) {
        if (c.length + size > arr.length)
            grow(arr.length + size);

        System.arraycopy(c, 0, arr, size, c.length);
        size += c.length;
        return true;
    }

    public boolean addAll(int index, int[] c) {
        if (c.length + size > arr.length)
            grow(arr.length + size);

        System.arraycopy(arr, index, arr, index + c.length, size - index);
        System.arraycopy(c, 0, arr, index, c.length);
        size += c.length;
        return true;
    }

    public boolean removeAll(int[] c) {
        int cursor = 0;
        int deleted = 0;

        for (int i = 0; i < size; i++) {
            boolean contains = false;
            for (int k : c) {
                if (i == k) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                arr[cursor++] = arr[i];
                deleted++;
            }
        }

        size -= deleted;
        return true;
    }

    public boolean retainAll(int[] c) {
        int cursor = 0;
        int deleted = 0;

        for (int i = 0; i < size; i++) {
            boolean contains = false;
            for (int k : c) {
                if (arr[i] == k) {
                    contains = true;
                    break;
                }
            }
            if (contains) {
                arr[cursor++] = arr[i];
            } else {
                deleted++;
            }
        }

        size -= deleted;
        return true;
    }

    public void clear() {
        Arrays.fill(arr, 0);
        size = 0;
    }

    public int get(int index) {
        return arr[index];
    }

    public int set(int index, int element) {
        int old = arr[index];
        arr[index] = element;
        return old;
    }

    public void add(int index, int el) {
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = el;
        size++;
    }

    public int indexOf(int el) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == el)
                return i;
        }

        return -1;
    }

    public int lastIndexOf(int el) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == el)
                return i;
        }

        return -1;
    }

    public MyArrayList subList(int fromIndex, int toIndex) {
        MyArrayList list = new MyArrayList();
        list.arr = Arrays.copyOfRange(arr, fromIndex, toIndex);
        list.size = arr.length;
        return list;
    }

    @Override
    public String toString() {
        if (size == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size - 1; i++) {
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(arr[size - 1]);
        sb.append(']');
        return sb.toString();
    }
}
