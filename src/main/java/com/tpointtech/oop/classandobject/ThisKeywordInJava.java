package com.tpointtech.oop.classandobject;

public class ThisKeywordInJava {
    public static void main(String[] args) {

        class Student {
            String name;
            int age;

            public Student(String name, int age) {
                this.name = name; // this.name is variable of this object
                this.age = age;
            }

            public Student(int age) {
                this("Anonymous", age);
            }

            public Student name(String name) {
                this.name = name;
                return this;
            }
        }

    }
}
