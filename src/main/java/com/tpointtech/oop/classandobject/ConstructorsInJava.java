package com.tpointtech.oop.classandobject;

public class ConstructorsInJava {
    public static void main(String[] args) {
        // Constructor is a special type of method
        //      which is used to initialize an object

        // Any class has default constructor by default
        // We only use access modifiers with constructors


        // Types of Java Constructors

        class Student {
            String name;
            int age;

            // Default Constructor (No-Arg Constructor)
            public Student() {
                System.out.println("This is a default constructor");
            }

            // Parameterized Constructor
            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Copy Constructor
            public Student(Student student) {
                this.name = student.name;
                this.age = student.age;
            }

            // Changing constructor
            public Student(String name) {
                this(name, 0);
            }
        }


    }
}
