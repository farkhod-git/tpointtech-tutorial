package com.tpointtech.exceptions;

public class ExceptionPropagationInJava {
    static void main() {
        // Exception propagation
        // m method throws exception because of n -> o -> throws exception
        try {
            m();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void m() {
        n();
    }

    static void n() {
        o();
    }

    static void o() {
        int a = 10 / 0; // throws Exception
    }
}
