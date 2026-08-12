package com.tpointtech.collections.queues.myqueue;

public class MyQueueDemo {
    static void main() {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
