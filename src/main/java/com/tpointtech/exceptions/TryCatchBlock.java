package com.tpointtech.exceptions;

public class TryCatchBlock {
    static void main() {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("Finally executed");
        }

        // Multiple catch block
        try {
            System.out.println(new int[]{1, 2, 3}[4]);
            System.out.println(1 / 0);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        // Nested try block
        try {
            try {
                System.out.println(new int[]{1, 2, 3}[4]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
