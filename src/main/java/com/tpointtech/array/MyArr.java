package com.tpointtech.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.StringJoiner;

public class MyArr implements Iterable<Integer> {

    private static final int DEFAULT_SIZE = 16;

    private int[] arr;
    private int size = 0;

    public MyArr(int initializeSize) {
        this.arr = new int[initializeSize];
    }

    public MyArr() {
        this(DEFAULT_SIZE);
    }


    // methods

    public void add(int val) {
        if (size == arr.length) {
            int[] newArr = new int[size * 2];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }

        arr[size++] = val;
    }

    public int get(int i) {
        Objects.checkIndex(i, size);
        return arr[i];
    }

    public void set(int i, int val) {
        Objects.checkIndex(i, size);
        arr[i] = val;
    }

    public void remove(int i) {
        Objects.checkIndex(i, size);
        System.arraycopy(arr, i + 1, arr, i, size-- - (i + 1));
    }

    public void reverse() {
        int left = -1;
        int right = size;

        while (++left < --right) {
            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
        }
    }

    public int size() {
        return this.size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public Integer next() {
                return arr[i++];
            }
        };
    }

    @Override
    public String toString() {
        StringJoiner s = new StringJoiner(", ", "[", "]");
        for (int i: this) {
            s.add(String.valueOf(i));
        }
        return s.toString();
    }
}
