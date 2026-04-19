package com.tpointtech.array;

public class MyArrDemo {
    public static void main(String[] args) {
        MyArr myArr = new MyArr();
        myArr.add(12);
        myArr.add(13);
        myArr.add(14);
        myArr.add(15);
        System.out.println(myArr);
        myArr.set(1, 77);
        System.out.println(myArr);
        myArr.remove(0);
        System.out.println(myArr);
        myArr.reverse();
        System.out.println(myArr);
    }
}
