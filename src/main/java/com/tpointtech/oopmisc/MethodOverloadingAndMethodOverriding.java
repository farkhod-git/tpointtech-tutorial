package com.tpointtech.oopmisc;

public class MethodOverloadingAndMethodOverriding {
    public static void main(String[] args) {

        // Method overloading - create a method with same name in class
        // must be different parameter list
        // method overloading defins at compile-time
        class Math {
            static int add(int a, int b) {
                return a + b;
            }

            static int add(int a, int b, int c) {
                return a + b + c;
            }
        }


        // Method overriding - rewrite method of superclass in subsclass
        // It defines at runtime
        class Vehicle {
            void drive() {
                System.out.println("Vehicle driving");
            }
        }

        class Car extends Vehicle {
            @Override
            void drive() {
                System.out.println("Car is driving");
            }
        }

        Vehicle vehicle = new Car();
        vehicle.drive(); // Car is driving.
        // it defins at runtime, because objects are created at runtime
    }
}
