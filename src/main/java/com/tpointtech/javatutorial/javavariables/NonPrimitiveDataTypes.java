package com.tpointtech.javatutorial.javavariables;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // Non-Primitive data types are also known as reference data types

        // Non-Primitive Data Types

        // 1. Class
        // Classes are used to create objects which are instances of the class
        class Car {
            String name;
            int year;
            double price;
            String color;
        }

        // 2. Interface
        // Interfaces are used to achieve abstraction and multiple inheritance
        interface Shape {
            void draw();

            void color();
        }

        // Arrays.
        // Arrays have a fixed size
        int[] numbers = {1, 2, 4, 5, 8};

        // String
        String nickname = "Farkhod";
        char[] letters = {'F', 'a', 'r', 'k', 'h', 'o', 'd'}; // = "Farkhod"

        // Enum (for limited values)
        enum Grade {
            FIRST,
            SECOND,
            THIRD
        }


    }
}
