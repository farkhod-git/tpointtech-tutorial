package com.tpointtech.collections.arraylist.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    static void main() {
        int[] a = {1, 2, 3, 4, 0};
        System.arraycopy(a, 1, a, 2, 3);
        System.out.println(Arrays.toString(a));


        System.out.println(6 << 1);

        ArrayList<Integer> list = new ArrayList<>();
        list.iterator();
        System.out.println(list.add(1));

        list.add(1, 2);
        list.clear();
        list.removeAll(List.of(1, 2, 3, 4, 5));

        list.ensureCapacity(100);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.clear();
        list.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.retainAll(List.of(2, 3, 4, 8, 9, 10, 11, 12));

        list.trimToSize();

        System.out.println(list);
    }
}
