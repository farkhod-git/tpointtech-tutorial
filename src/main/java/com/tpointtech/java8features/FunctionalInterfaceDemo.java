package com.tpointtech.java8features;

public class FunctionalInterfaceDemo {
    static void main() {
        // Functional Interfaces are also known as Single Abstract Method (SAM) Interfaces
        @FunctionalInterface
        interface SimpleFunctionalInterface {
            void method();
        }

        SimpleFunctionalInterface sfi = () -> System.out.println("Hello World");
        sfi.method();
    }
}
