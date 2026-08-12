package com.tpointtech.collections.queues.deque;

public class MyArrayDequeDemo {
    static void main() {
        MyArrayDeque deque = new MyArrayDeque(10);
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerFirst(4);

        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.peekFirst());
        deque.offerLast(7);
        System.out.println(deque.peekLast());

        System.out.println(deque);

    }
}
