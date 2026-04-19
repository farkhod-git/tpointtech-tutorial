package com.tpointtech.oop.polymorphism;

public class InstanceOfKeyword {
    public static void main(String[] args) {

        // the instanceof operator is used to check
        //   whether an object is instance of a specific class, subclass or interface

        // instanceof returns true or false.
        // it always returns false with null values

        class A {
        }
        class B extends A {
        }
        class C extends B {
        }
        class D {
        }

        A a = new A();
        Object b = new D();

        if (b instanceof A) {
            System.out.println("");
        }

        class Test {
            void check(A a) {
                if (a instanceof C) {
                    System.out.println("C class");
                } else if (a instanceof B b) {
                    System.out.println("B class");
                }
            }

            void downCasting(A a) {
                B b = (B) a; // down casting
                System.out.println("This is a B class");
            }
        }

        Test test = new Test();
        test.check(new B());
        test.check(new C());

        test.downCasting(new C()); // right
        test.downCasting(new B()); // right
        test.downCasting(new A()); // ClasCastException (use instanceof to avoid runtime exception)
    }
}
