package com.tpointtech.oop.polymorphism;

public class InstanceInitializerBlock {
    public static void main(String[] args) {

        class B {
            {
                System.out.println("B Instance Initializer Block");
            }

            public B(String a) {
                System.out.println(a + "B Constructor");
            }
        }

        class A extends B {
            {
                System.out.println("Instance Initializer Block");
                a();
            }

            public A() {
                super("CCC");
                System.out.println("Constructor");
                a();
            }

            void a() {
                System.out.println("Method");
            }
        }

        new A();

    }
}
