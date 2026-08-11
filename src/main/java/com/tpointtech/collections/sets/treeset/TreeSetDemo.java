package com.tpointtech.collections.sets.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
    static void main() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(4);
        set.add(10);

        // ceiling returns the smallest element greater than or equal to the specified element
        System.out.println(set.ceiling(2)); // 4
        System.out.println(set.ceiling(11)); // null

        // floor returns the largest element less than or equal to the specified element
        System.out.println(set.floor(1)); // 1
        System.out.println(set.floor(5)); // 4
        System.out.println(set.floor(0)); // null

        System.out.println(set.higher(1)); // 4
        System.out.println(set.lower(4)); // 1

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.pollLast());
        System.out.println(set.pollLast());
        System.out.println(set.size());

        System.out.println(" -- ---");
        set.add(11);
        set.add(22);
        set.add(33);
        System.out.println(set.first());
        System.out.println(set.last());

    }
}
