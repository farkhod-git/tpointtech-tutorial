package com.tpointtech.oop.abstraction;

public class Interface {
    public static void main(String[] args) {
        // An interface is a blueprint of a class
        //      that contains static constants and abstract methods

        // Since java 8 interfaces can include default method and static methods
        // Since java 9 interfaces can include private methods

        // We achieve multiple inheritance in Java with interfaces

        {
            interface Flyable {
                int MAX_HEIGHT = 500; // km

                void fly();

                void land();
            }

            interface Soundable {
                void sound();
            }

            class Airplane implements Flyable {
                @Override
                public void fly() {
                    System.out.println("Airplane is flying...");
                }

                @Override
                public void land() {
                    System.out.println("Airplane is landing...");
                }
            }

            abstract class Bird implements Flyable, Soundable {
                final String name;

                Bird(String name) {
                    this.name = name;
                }

                @Override
                public void fly() {
                    System.out.println(name + " is flying...");
                }

                @Override
                public void land() {
                    System.out.println(name + " is landing...");
                }
            }

            class Dove extends Bird {
                Dove(String name) {
                    super(name);
                }

                @Override
                public void sound() {
                    System.out.println("Dove is making sound");
                }
            }

            Dove dove = new Dove("White Dove");
            dove.fly();
            System.out.println(Flyable.MAX_HEIGHT);
            dove.sound();
            dove.land();

        }

        // Multiple inheritance
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
                    System.out.println("C");
                }
            }

            C c = new C();
            c.m();
        }

    }
}
