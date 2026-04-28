package com.tpointtech.oopmisc;

public class CallByValue {
    public static void main(String[] args) {
        // Java always uses call by value

        int a = 10;
        m1(a);
        System.out.println(a); // a = 10



        B b = new B();
        b.val = 10;
        m2(b);
        System.out.println(b.val); // still 10



    }

    static void m2(B b) {
        b = new B();
        b.val = 11;
    }

    static void m1(int var) {
        var = 11;
        System.out.println(var);
    }
}

class B {
    int val;
}
