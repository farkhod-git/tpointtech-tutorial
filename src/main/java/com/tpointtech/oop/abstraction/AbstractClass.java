package com.tpointtech.oop.abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        // What is abstraction?
        // Abstraction is the process of hiding implementation details
        //      and showing only the required functionality to the user
        // Abstraction allows you to focus on what an object does
        //      rather than how it does it

        // there are two ways to achieve abstraction in Java
        //      1. Abstract class (can provide 0% to 100% abstraction)
        //      2. Interface (can provide 100% abstraction)


        // Abstract class - a class is declared with abstract keyword
        // Abstract class is only used as parent class
        {
            abstract class Animal {
                // abstract method hasn't body
                abstract void sound();

                // non-abstract method
                void breathe() {
                    System.out.println("Animal is breathing...");
                }
            }

            class Dog extends Animal {
                // it's important to override for concrete class
                @Override
                void sound() {
                    System.out.println("Woof!");
                }
            }
        }
    }
}
