package com.tpointtech.oop.inheritance;

public class InheritanceInJava {
    public static void main(String[] args) {

        // Inheritance represents IS-A relationship
        // Method overriding and Code reusability

        {
            // A Class is a Super / Parent class
            // B Class is a Sub / Child class

            class A {
                final int a = 10;

                void a() {
                    System.out.println("This method from A class");
                }
            }

            class B extends A { // Single Inheritance B -> A
                final int b = 20;

                // Method overriding - Runtime polymorphism
                @Override
                void a() {
                    System.out.println("This method from B class");
                }
            }

            B b = new B();
            System.out.println(b.a);
            System.out.println(b.b);
            b.a();

            A a = new B();
            a.a();

        }

        // Single Inheritance
        {
            class A {
            }
            class B extends A {
            }
        }

        // Multilevel Inheritance (Between C and A)
        {
            class A {
                final int a = 1;
            }
            class B extends A {
                final int b = 2;
            }
            class C extends B {
                void c() {
                    System.out.println(super.b); // or b
                    System.out.println(super.a);
                }
            }
        }

        // Hierarchical Inheritance
        {
            class Animal {
            }

            class Dog extends Animal {
            }

            class Rabbit extends Animal{
            }

            class Cat extends Animal{
            }
        }

        // Multiple Inheritance (Through Interfaces)

        {
            interface Fly {
                void fly();
            }

            interface Engine {
                void start();
            }

            class Bird implements Fly {
                @Override
                public void fly() {
                    System.out.println("The bird is flying...");
                }
            }

            class Airplane implements Engine, Fly {
                @Override
                public void fly() {
                    System.out.println("Airplane is flying...");
                }

                @Override
                public void start() {
                    System.out.println("Engine of Airplane started.");
                }
            }
        }


        // test
        {
            class A {
                void a() {
                    System.out.println("A");
                }
            }

            class B extends A {
                @Override
                void a() {
                    System.out.println("B");;
                }
            }

            class C extends B {
            }

            B b = new B();
            b.a();

            A c = new C();
            c.a();
        }

        // multiple inheritance with interfaces and super keyword
        {
            interface A {
                default void m() {
                    System.out.println("A");
                }
            }

            interface B {
                default void m() {
                    System.out.println("B");
                }
            }

            class C implements A, B {
                @Override
                public void m() {
                    A.super.m();
                    B.super.m();
                }
            }

            C c = new C();
            c.m();
        }

    }
}
