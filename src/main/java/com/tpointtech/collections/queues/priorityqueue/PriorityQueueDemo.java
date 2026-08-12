package com.tpointtech.collections.queues.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    static void main() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(2);
        queue.add(7);
        queue.add(4);
        queue.add(1);
        queue.add(9);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
