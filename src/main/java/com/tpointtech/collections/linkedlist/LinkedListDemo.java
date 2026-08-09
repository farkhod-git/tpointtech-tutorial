package com.tpointtech.collections.linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    static void main() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.offerFirst(1);
        list.containsAll(List.of(12, 1, 2, 3));
        list.addAll(List.of(12, 1, 2, 3));
        list.clear();
        list.push(10);
        list.removeFirstOccurrence(10);
        list.pollFirst();
        list.remove(10);
        list.element();
        list.peek();
        list.reversed();

    }
}
