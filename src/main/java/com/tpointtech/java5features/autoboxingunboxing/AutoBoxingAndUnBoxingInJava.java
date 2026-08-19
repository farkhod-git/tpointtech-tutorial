package com.tpointtech.java5features.autoboxingunboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnBoxingInJava {
    public static void main(String[] args) {
        // Autoboxing is automatic conversion of primitive type into Wrapper type
        int a = 10;
        Integer a1 = new Integer(a); // Deprecated
        Integer a2 = Integer.valueOf(a); // Manual boxing (Recommended)
        Integer a3 = a; // Autoboxing (Cleanest)
        System.out.println(a1 + " " + a2 + " " + a3);

        // Unboxing - The automatic conversion of Wrapper type into primitive type
        Integer b = new Integer(5);
        int b1 = b;
        System.out.println(b1);

        // Java Collections cannot store primitive types,
        //      Autoboxing allows to store primitive types in Wrapper collections
        List<Integer> list = new ArrayList<>();
        int el = 10;
        list.add(el); // Autoboxing
        System.out.println(list);

        byte i1 = 1;
        short i2 = 2;
        int i3 = 3;
        Integer i4 = 4;
        a(i1);
        a(i2);
        a(i3);
        a(i4);
    }

    static void a(Integer i) {
        System.out.println("Integer");
    }

    static void a(int i) {
        System.out.println("int");
    }
}
