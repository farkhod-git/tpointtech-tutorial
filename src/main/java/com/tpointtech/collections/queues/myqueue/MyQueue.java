package com.tpointtech.collections.queues.myqueue;

import java.util.*;

public class MyQueue implements Queue<Integer> {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private static final int DEFAULT_CAPACITY = Integer.MAX_VALUE;

    private Node head;
    private Node tail;
    private int size = 0;
    private final int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
    }

    public MyQueue() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public boolean add(Integer el) {
        if (el == null)
            throw new NullPointerException();

        if (size == capacity)
            throw new IllegalStateException("Queue is full");

        connect(el);
        return true;
    }

    @Override
    public boolean offer(Integer el) {
        if (el == null || size == capacity)
            return false;

        connect(el);
        return true;
    }

    private void connect(int el) {
        Node newNode = new Node(el);

        if (head == null)
            head = newNode;
        else
            tail.next = newNode;

        tail = newNode;

        size++;
    }

    @Override
    public Integer remove() {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty");
        return removeFirstNode().val;
    }

    private Node removeFirstNode() {
        Node d = head;
        head = d.next;
        d.next = null;
        size--;
        return d;
    }

    @Override
    public Integer poll() {
        if (size == 0)
            return null;

        return removeFirstNode().val;
    }

    @Override
    public Integer element() {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty");

        return head.val;
    }

    @Override
    public Integer peek() {
        if (size == 0)
            return null;

        return head.val;
    }

    // ----


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Integer i : this)
            if (i.equals(o))
                return true;

        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            Node cursor = head;

            @Override
            public boolean hasNext() {
                return cursor != null;
            }

            @Override
            public Integer next() {
                Integer val = cursor.val;
                cursor = cursor.next;
                return val;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Integer[] arr = new Integer[size];
        int i = 0;
        for (Integer el : this)
            arr[i++] = el;

        return arr;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        Node current = head;

        if (Objects.equals(current.val, o)) {
            if (size-- == 1) {
                head = tail = null;
                return true;
            }

            head = current.next;
            return true;
        }

        while (current.next != null) {
            if (Objects.equals(current.next.val, o)) {
                current.next = current.next.next;
                size--;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object el : this)
            for (Object o : c)
                if (!Objects.equals(el, o))
                    return false;

        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for (Integer el : c)
            add(el);
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object o : c)
            remove(o);

        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }
}
