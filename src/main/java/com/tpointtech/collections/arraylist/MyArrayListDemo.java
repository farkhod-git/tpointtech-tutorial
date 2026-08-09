package com.tpointtech.collections.arraylist;

public class MyArrayListDemo {
    static void main() {

        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(4);
        list.addAll(new int[]{1, 2, 3});
        list.removeAll(new int[]{1, 2, 3});
        System.out.println(list);

    }
}
