package com.tpointtech.java8features;

public class StaticAndDefaultMethodInInterface {
    static void main() {
        interface MyInterface {
            static void myMethod() {
                System.out.println("Static method in interface");
            }

            default void myDefaultMethod() {
                System.out.println("Default method in interface");
            }
        }

        MyInterface.myMethod();
        MyInterface myInterface = new MyInterface() {};
        myInterface.myDefaultMethod();
    }
}
