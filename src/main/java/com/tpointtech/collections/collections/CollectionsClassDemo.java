package com.tpointtech.collections.collections;

import java.util.*;

public class CollectionsClassDemo {
    static void main() {
        // addAll()
        List<Integer> l1 = new ArrayList<>();
        Collections.addAll(l1, 1, 2, 3);
        System.out.println(l1);

        int i = Collections.binarySearch(l1, 2);
        System.out.println(i);

        // when element is added it checks that type of element is Integer
        // Runtime checking
        Collection<Integer> abs = Collections.checkedCollection(l1, Integer.class);
        List<Integer> absList = Collections.checkedList(l1, Integer.class);

        List<String> l2 = new ArrayList<>();
        l2.add("one");
        l2.add("two");
        List<String> l3 = new ArrayList<>();
        l3.add("three");
        l3.add("four");
        Collections.copy(l3, l2);
        System.out.println(l3);

        List<Integer> l4 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> l5 = List.of(6, 4, 5);
        // true if there is no common element
        boolean disjoint = Collections.disjoint(l4, l5);
        System.out.println(disjoint);

        Collections.fill(l4, 99);
        System.out.println(l4);

        System.out.println(Collections.frequency(l4, 99));
        System.out.println(Collections.indexOfSubList(l4, List.of(99)));
        System.out.println(Collections.min(l5) + " - " + Collections.max(l5));
        System.out.println(Collections.nCopies(20, 77));

        boolean exists = Collections.replaceAll(l4, 99, 100);
        System.out.println(exists);
        System.out.println(l4);



        List<Integer> l6 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Collections.reverse(l6);
        System.out.println(l6);

        Collections.rotate(l6, 2);
        System.out.println(l6);

        List<Integer> integers = Collections.unmodifiableList(l6);
        integers.add(1);
        System.out.println(integers);
    }
}
