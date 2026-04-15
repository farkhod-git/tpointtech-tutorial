package com.tpointtech.javatutorial.javaoperators;

public class JavaBitwiseOperators {
    public static void main(String[] args) {
        // BITWISE OPERATORS
        //

        // | Bitwise OR
        // & Bitwise AND
        // ^ Bitwise XOR
        // ~ Bitwise Complement (changes 0 to 1, 1 to 0)

        System.out.println(3 | 4); // 11 | 100 = 111 = 7
        System.out.println(5 & 6); // 101 | 110 = 100 = 4
        System.out.println(5 ^ 6); // 101 | 110 = 011 = 3
        System.out.println(~5); // -6 ()
    }
}