package com.tpointtech.oop;

import java.util.List;

public class OOPConceptsInJava {
    public static void main(String[] args) {
        // OOP
        // Object-oriented programming is a paradigm that provides concepts,
        //  such as inheritance, data binding, polymorphism, etc.

        // Object-oriented programming is a paradigm for designing a program using classes and objects
        // Object, Class, Inheritance, Polymorphism, Abstraction, Encapsulation

        // There some terms which are used in Object-oriented design
        // Coupling, Cohesion, Association, Aggregation, Composition

        // An Object can be defined an instance of a class.
        // Primary elements of object
        //      State, Behaviour, Methods



        // OOP CONCEPTS

        // 1. Class 2. Object
        {
            // Class is a template to create an object
            class Dog {
                String name;

                void bark() {
                    System.out.println(name + " says Woof!");
                }
            }


            // 2 Object (instance of class)
            Dog myDog = new Dog();
            myDog.name = "Sharik";
            myDog.bark();
        }

        // 3 Inheritance
        // An object can be a parent object for another object
        {
            class Shape {
                String name;

                void draw() {
                    System.out.println(name + " is drown");
                }
            }

            class Triangle extends Shape {
                int sideA;
                int sideB;
                int sideC;
            }

            Triangle triangle = new Triangle();
            triangle.draw();
        }

        // 4. Polymorphism
        // If one task is performed in different ways,
        // it is known as polymorphism
        // In java we use method overloading and method overriding to achieve polymorphism

        {
            // 1 Overloading
            class Person {
                void greeting() {
                    System.out.println("Hi guys..");
                }

                void greeting(String name) {
                    System.out.println("Hello " + name + ". How are you?");
                }
            }

            // 2 Overriding
            abstract class Vehicle {
                void start() {
                    System.out.println("Vehicle started!");
                }
            }

            class Ferrari extends Vehicle {
                @Override
                void start() {
                    System.out.println("Ferrari started!");
                }
            }

        }

        // 5. Abstraction
        // Hiding internal implementation and showing functionality only to the user
        // is known as abstraction
        // In java we use abstract class and interface to achieve abstraction

        {
            abstract class Animal {
                void breathe() {
                    System.out.println("Animal is breathing...");
                }

                abstract void makeSound(); // sound is abstract
            }

            class Dog extends Animal { // Dog is concrete class, and we know they make what sound
                @Override
                void makeSound() {
                    System.out.println("Woof!");
                }
            }

            Dog dog = new Dog();
            dog.breathe();
            dog.makeSound();


            // Interface (fully abstraction)
            interface Fly {
                void fly();
            }

            class Bird implements Fly {
                @Override
                public void fly() {
                    System.out.println("Bird is flying!");
                }
            }

            class Airplane implements Fly {
                @Override
                public void fly() {
                    System.out.println("Airplane is flying!");
                }
            }

            Fly bird = new Bird();
            bird.fly();

            Fly airplane = new Airplane();
            airplane.fly();
        }

        // 6. Encapsulation
        // Binding (or wrapping) code and data together
        // into a single unit is known as encapsulation

        {
            // This shows encapsulation by using private data members
            // and their public getter setter methods

            class Student {
                private String name;

                public void setName(String name) {
                    this.name = name;
                }

                public String getName() {
                    return name;
                }
            }

            Student student = new Student();
            student.setName("Farkhod");
            System.out.println(student.getName());

        }
    }

    public static class OOPTerms {
        public static void main(String[] args) {
            // COUPLING
            // If a class has information another class
            // there is coupling

            {
                // Tight coupling

                {
                    class Engine {
                        void start() {
                            System.out.println("Engine started");
                        }
                    }

                    class Car {
                        private final Engine engine = new Engine(); // tight coupling

                        void drive() {
                            engine.start();
                            System.out.println("Driving");
                        }
                    }
                }

                // Loose coupling

                {
                    interface Engine {
                        void start();
                    }

                    class PatrolEngine implements Engine {
                        @Override
                        public void start() {
                            System.out.println("Patrol engine started..");
                        }
                    }

                    class TurboEngine implements Engine {
                        @Override
                        public void start() {
                            System.out.println("Turbo engine started..");
                        }
                    }

                    class Car {
                        private final Engine engine;
                        private int counter;

                        public Car(Engine engine) {
                            this.engine = engine;
                        }

                        void drive() {
                            engine.start();
                            System.out.println("Driving...");
                        }
                    }

                    Car car = new Car(new PatrolEngine());
                    car.drive();

                    Car car1 = new Car(new TurboEngine());
                    car1.drive();
                }
            }


            // Cohesion in Java
            {
                // not cohesiveness
                class General {
                    void add(int a, int b) {
                        System.out.println("a + b = " + (a + b));
                    }

                    void findVowel(char c) {
                        switch (c) {
                            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                            default -> System.out.println("Consonant");
                        }
                    }
                }



                // cohesiveness
                class Arithmetic {
                    void add(int a, int b) {
                        System.out.println("a + b = " + (a + b));
                    }
                }

                class CharacterOperations {
                    void findVowel(char c) {
                        switch (c) {
                            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                            default -> System.out.println("Consonant");
                        }
                    }
                }
            }
        }
    }

    public static class Relationships {

        public static void main(String[] args) {

            // Association
            // the association represents relationships between objects

            // one-to-one
            // one-to-many
            // many-to-one
            // many-to-many


            // 1 IS-A Association

            class Pet {
                void eat() {
                    System.out.println("Pet is eating...");
                }
            }

            class Bunny extends Pet { // Bunny is a Pet // IS-A relationship
                void jump() {
                    System.out.println("Bunny is jumping...");
                }
            }


            // 2 HAS-A relationship
            //      a) Aggregation
            //      b) Composition


            // Aggregation (Robust)
            class Engine {
                void start() {
                    System.out.println("Engine started!");
                }
            }

            class Car {
                final String name;
                final Engine engine;

                // aggregation: Car needs engine
                public Car(String name, Engine engine) {
                    this.name = name;
                    this.engine = engine;
                }
            }


            // Composition
            class Phone {
                String name;
                double price;
            }

            class PhoneStore {
                final String name;
                final String address;
                private List<Phone> phones;

                public PhoneStore(String name, String address) {
                    this.name = name;
                    this.address = address;
                }

                // Composition
                public void setPhones(List<Phone> phones) {
                    this.phones = phones;
                }

                public List<Phone> getPhones() {
                    return phones;
                }
            }

        }

    }
}
