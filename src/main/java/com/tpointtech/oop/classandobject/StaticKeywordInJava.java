package com.tpointtech.oop.classandobject;

public class StaticKeywordInJava {
    public static void main(String[] args) {
        // We can apply static keyword with variables, blocks, methods, nested classes
        // Static keyword belongs to the class no an instance of the class
        // static methods, variables, blocks creates method area (type of memory)

        StaticNestedClass.staticMethod();
        StaticNestedClass.staticMethod();

    }

    String instanceVariable = "I V";


    class StaticNestedClass {
        static {
            System.out.println("Static block");
        }

        {
            System.out.println(instanceVariable);
        }

        static final String staticVariable = "Static variable";

        static void staticMethod() {
            System.out.println("Static method started...");
            System.out.println(staticVariable);
        }
    }
}
