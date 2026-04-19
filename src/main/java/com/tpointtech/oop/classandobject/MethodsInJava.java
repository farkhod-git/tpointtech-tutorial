package com.tpointtech.oop.classandobject;

public class MethodsInJava {
    public static void main(String[] args) {
        // a method is a block of code or a collection of statements
        // A method is used to achieve the reusability of code
        // We write a method once and use it many times


        // Advantages of using Methods

        // 1. Reusability
        // Method provide code reusability. Once method is defined,
        // it can be called multiple times from various places parts of the program

        // 2. Modularity
        // Methods help break down complex problems into smaller, manageable pieces

        // 3. Maintainability
        // Updating and debugging code becomes easier with methods

        // 4. Abstractions
        // Methods provide abstractions


        // Java has two types of methods
        // - Predefined methods
        // - User-defined methods

        double pow = Math.pow(2, 5); // Predefined method
        double pow1 = pow(2, 5); // User-defined method
    }

    // Method declaration.
    // Method declaration provides about method attributes
    //      such as visibility, return type, name, arguments and a body

    // public int sum(int a, int b) - method header
    // public - Access specifier / Modifier (visibility of method)
    // int - return type
    // sum - method name
    // (int a, int b) - parameter list
    // {return a + b} - method body
    public int sum(int a, int b) {
        return a + b;
    }

    // Method Signature.
    // Method name and parameter list together are method signature
    // sum(int a, int b, int c) - method signature
    // You can create methods with same name (overloading)
    // but not same method signature
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Access specifier / Modifier
    // public - Method is accessible to all classes
    // private - Method is accessible only in the class which method defined
    // protected - Method is accessible within the same package or subclasses
    // default (we don't write it) - Method is accessible only within same package

    public void publicMethod() {
    }

    private void privateMethod() {
    }

    protected void protectedMethod() {
    }

    void defaultMethod() {
    }

    static double pow(int num, int degree) {
        double res = 1;
        for (int i = 0; i < degree; i++) {
            res *= num;
        }
        return res;
    }
}
