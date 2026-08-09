package com.tpointtech.collections.arraylist.simple;

import java.util.List;

public class MyArrayListDemo {
    static void main() {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(2, 2);

        System.out.println(list);

        list.add(2, 22);
        list.add(4, 33);
        list.add(0, 44);

        list.addAll(0, List.of(7, 7, 7));
        System.out.println(list);

        list.clear();
        list.addAll(List.of(1, 2, 3, 4, 5));
        list.ensureCapacity(20);
        System.out.println(list);
    }
}
