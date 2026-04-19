package com.tpointtech.oop.classandobject;

public class JavaClassesAndObjects {
    public static void main(String[] args) {
        // Class.

        {
            // A class is a group of objects that have common properties
            // A class is type of object
            // A class is a template or blueprint from which objects are created
            // A class is a logical entity
            // A class can't be physical

            // A class contains fields, methods, constructors, blocks, inner class and interfaces

            // class
            class Laptop {
                // blocks
                {
                    System.out.println("New laptop created");
                }

                //  fields
                String name;
                double price;

                // Constructors
                public Laptop() {
                }

                public Laptop(String name, double price) {
                    this.name = name;
                    this.price = price;
                }

                // method
                void run() {
                    System.out.println("Welcome");
                }

                // inner class or interfaces
                static class InnerClass {
                }

                static interface InnerInterface {
                }
            }

            // 1. Fields -
            // 2. Methods - are functions that defined inside a class that include actions and behaviours
            // 3. Constructors - are unique methods that same name with class and that are used to initialize objects

            // 4. Blocks - Java allows two types of blocks, static and instance
            // Static blocks are only executed once when the class is loaded into memory
            // Instance blocks can be used to initialize every instance variables and executed each time a class object is generated

            // 5. Nested class and interface
            // Classes and interfaces are inside other classes and interfaces are Nested classes and interfaces

        }

        // Object

        {
            // An object is an instance of a class.
            // An object is a real-world entity that has state and behaviours
            // Class is a type, object is a value
            class Car {
                String name;
            }

            // Car - Class
            // car - variable
            // new - to create new object
            // Car() - constructor of Car class
            // car is an object
            Car car = new Car();
            car.name = "Ferrari";
            System.out.println(car.name);

            // An object is a real-world entity
            // An object is a runtime entity
            // An object is an entity that has state and behaviours
            // An object is an instance of a class

            // All objects get memory in the Heap arear
        }

        // Different ways to create an object in Java




        // 1. By new keyword ()
        Car car1 = new Car();
        car1.name = "Ferrari";
        car1.price = 2000_000D;
        car1.color = Car.CarColor.RED;
        System.out.println(car1.color + " " + car1.name + " - " + car1.price + " $");

        // 2. By newInstance() Method

        try {
            Car car = (Car) Class.forName("com.tpointtech.oop.classandobject.Car").newInstance();
            car.name = "Lamborghini";
            System.out.println(car.name);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 3. By clone() Method
        // Car clone = (Car) car1.clone();

        // 4. By Deserialization
        // ObjectInputStream, readObject() - from file, network

        // 5. By factory method
        Car instance = Car.createInstance();
        instance.name = "BMW";
        System.out.println(instance.name);
    }
}
