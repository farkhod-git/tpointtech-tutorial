package com.tpointtech.oopmisc;

public class RecursionInJava {
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println(factorial);

        int fibonacci = fibonacci(4);
        System.out.println(fibonacci);
    }

    static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        return n <= 2 ? 1 : (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
