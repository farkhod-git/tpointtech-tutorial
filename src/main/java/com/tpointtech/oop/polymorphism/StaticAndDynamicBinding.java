package com.tpointtech.oop.polymorphism;

public class StaticAndDynamicBinding {
    public static void main(String[] args) {
        // When the type of object is determined at compile-time (by the compiler),
        //      it is known as static binding

        // When the type of object is determined at runtime (by JVM),
        //      it is known as dynamic binding

        class A {
            void m() {
                System.out.println("A class");
            }
        }

        class B extends A {
            @Override
            void m() {
                System.out.println("B class");
            }
        }

        // static binding
        A a = new A();
        a.m();

        // dynamic binding
        A b = new B();
        b.m();

    }
}
