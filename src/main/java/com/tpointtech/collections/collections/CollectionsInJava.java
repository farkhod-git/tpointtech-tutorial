package com.tpointtech.collections.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsInJava {
    static void main() {
        // Collection interface

        Collection<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("-- Iterator --");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        class MyCollection implements Iterable<Integer> {
            public final int[] a = {};

            @Override
            public Iterator<Integer> iterator() {
                int[] i = {0};

                return new Iterator<>() {
                    @Override
                    public boolean hasNext() {
                        return i[0] < a.length;
                    }

                    @Override
                    public Integer next() {
                        return a[i[0]++];
                    }
                };
            }
        }

    }
}
