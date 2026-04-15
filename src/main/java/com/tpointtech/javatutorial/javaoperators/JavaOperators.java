package com.tpointtech.javatutorial.javaoperators;

public class JavaOperators {
    public static void main(String[] args) {
        // 1. Unary operators
        {
            // Java unary operators require only one operand

            // + Unary Plus
            int positive = +123; // it equals 123

            // - Unary Minus
            int negative = -123;

            // ! Logical Compliment Operator (Logically Not)
            boolean big = true;
            boolean small = !big;

            // ++ Increment
            // operand++ is post increment, ++operand is pre increment
            int a = 15;
            int b = a++; // b = 15, a = 16
            int c = 15;
            int d = ++c; // c = 16, d = 16

            // -- Decrement
            // operand-- is post decrement, --operand is pre decrement
            a = 16;
            b = a--; // b = 16, a = 15
            c = 15;
            d = --c; // c = 14, d = 14

            // ~ Bitwise Complement is also bitwise operator
            System.out.println(~10); // -11
            System.out.println(~-5); // 4 because 0 is on the positive side
        }

        // 2. Arithmetic Operators
        {
            // Java binary operators are used to perform
            // addition +, subtraction -, multiplication *, division / and modulo operation %
            System.out.println(8 + 4); // 12
            System.out.println(8 - 4); // 4
            System.out.println(8 * 4); // 32
            System.out.println(8 / 4); // 2 (10 / 4 = 2 but 10.0 / 4.0 = 2.5)
            System.out.println(13 % 5); // 3 because 13 = 5 * 2 + 3
        }

        // Shift Operators
        {
            System.out.println("SHIFT OPERATORS");
            // << Left shift operator (Signed +-) (12 << 1 is same 12 * 2, 12 << 2 is same 12 * 2 * 2)
            /*
                3 = 00011
                Let's shift it one step to left
                00110 is 6
             */
            int a = Integer.parseInt("011", 2);
            System.out.println(a);
            System.out.println(12 << 1);

            // >> Right shift operator (Signed +-)
            System.out.println(12 >> 1); // 6
            System.out.println(12 >> 2); // 3

            System.out.println(Integer.toBinaryString(-12));
            System.out.println(Integer.toBinaryString(-12 >> 1));
            System.out.println(Integer.toBinaryString(-12 << 1));

            System.out.println(-12 >> 1);
            System.out.println(-12 << 1);


            ///  >>> Right shift (Unsigned)

            System.out.println(Integer.toBinaryString(12));
            System.out.println(Integer.toBinaryString(12 >>> 1));
            System.out.println(Integer.toBinaryString(-12));
            System.out.println(Integer.toBinaryString(-12 >>> 1));
        }
    }
}
