package com.tpointtech.collections.queues.deque;

public class MyArrayDeque {
    Integer[] arr;
    int size;
    int head;
    int tail;

    public MyArrayDeque(int initialCapacity) {
        arr = new Integer[initialCapacity];
        size = 0;
        head = 0;
        tail = initialCapacity - 1;
    }

    public MyArrayDeque() {
        this(16);
    }

    public void offerFirst(Integer el) {
        if (size == arr.length)
            grow();

        arr[head] = el;
        head = (head + 1) % arr.length;
        size++;
    }

    public void offerLast(Integer el) {
        if (size == arr.length)
            grow();

        arr[tail] = el;
        tail = (tail - 1 + arr.length) % arr.length;
        size++;
    }

    public Integer pollFirst() {
        if (size == 0)
            return null;

        size--;
        return arr[head = (head - 1 + arr.length) % arr.length];
    }

    public Integer pollLast() {
        if (size == 0)
            return null;
        size--;
        return arr[tail = (tail + 1) % arr.length];
    }

    public Integer peekFirst() {
        if (size == 0)
            return null;
        return arr[(head - 1 + arr.length) % arr.length];
    }

    public Integer peekLast() {
        if (size == 0)
            return null;
        return arr[(tail + 1) % arr.length];
    }

    private void grow() {
        Integer[] newArr = new Integer[arr.length * 2 + 1];
        System.arraycopy(arr, tail + 1, newArr, 0, size - tail - 1);
        System.arraycopy(arr, 0, newArr, size - tail - 1, head);
        head = arr.length;
        tail = newArr.length - 1;
        arr = newArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[(head - 1 - i + arr.length) % arr.length]);
            if (i != size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
