package com.tpointtech.oop.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism is an object-oriented programming concept
        //      that allows a single action or method to behave in different ways

        // poly and morphs are Greek words
        // poly - many
        // morphs - forms
        // Therefore polymorphism means many forms

        // There are two types of polymorphism in Java
        //      1. Compile-time polymorphism (method overloading)
        //      2. Runtime polymorphism (method overriding)

        // We can perform polymorphism in Java by method overloading and method overriding

        // 1. Method overloading
        // We can create methods with same names but different parameter list
        {
            class Calculator {
                int sum(int a, int b) {
                    return a + b;
                }

                double sum(double a, double b) {
                    return a + b;
                }
            }

            Calculator calculator = new Calculator();
            System.out.println(calculator.sum(1, 2));
            System.out.println(calculator.sum(2.5, 8.9));
        }

        // Runtime polymorphism (also known as Dynamic Method Mismatch)
        {
            // first let's understand Upcasting
            class A {
            }
            class B extends A{
            }

            A a = new B(); // upcasting
            // A is reference variable, B is an object


            class Bike {
                void run() {
                    System.out.println("Bike is running...");
                }
            }

            class Splendor extends Bike {
                @Override
                void run() {
                    System.out.println("Splendor is running...");;
                }
            }

            Bike bike = new Splendor(); // upcasting
            bike.run(); // Splendor is running..., Reference is Bike but object is Splendor
        }

        // Runtime polymorphism cannot be achieved with data members
        {
            class Bike {
                int speedLimit = 90;
            }

            class Honda extends Bike {
                int speedLimit = 150;
            }

            Bike bike = new Honda();
            System.out.println(bike.speedLimit); // 90

            Honda honda = new Honda();
            System.out.println(honda.speedLimit); // 150
        }
    }
}
