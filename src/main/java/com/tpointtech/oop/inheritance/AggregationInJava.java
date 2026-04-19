package com.tpointtech.oop.inheritance;

public class AggregationInJava {
    public static void main(String[] args) {

        // HAS-A relationship
        //      Aggregation
        //      Composition

        // If a class has a reference to another class
        //      it is known as aggregation

        class Address {
            String city;
            String street;
            int homeNumber;
        }

        class Student {
            String name;
            int age;
            Address address; // HAS-A relationship

            public Student(String name, int age, Address address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAddress(Address address) {
                this.address = address;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

    }
}
