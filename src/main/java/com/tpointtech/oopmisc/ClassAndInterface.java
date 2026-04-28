package com.tpointtech.oopmisc;

public class ClassAndInterface {
    public static void main(String[] args) {
        // Class is a blueprint for creating object
        // Interface is a blueprint to structure classes

        interface Flyable {
            void fly();

            void land();
        }

        interface Runnable {
            void run();

            void stop();
        }

        abstract class Animal {
            String name;
            String type;
        }

        class Bird extends Animal implements Flyable {
            @Override
            public void fly() {

            }

            @Override
            public void land() {

            }
        }

        class Dog extends Animal implements Runnable {
            @Override
            public void run() {

            }

            @Override
            public void stop() {

            }
        }

        class Chicken extends Animal implements Flyable, Runnable {
            @Override
            public void run() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void fly() {

            }

            @Override
            public void land() {

            }
        }
    }
}
