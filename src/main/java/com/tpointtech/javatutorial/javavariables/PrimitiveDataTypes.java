package com.tpointtech.javatutorial.javavariables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // PRIMITIVE DATA TYPES

        // 1. Boolean
        // size: 1 byte (8 bits).
        // range: [false, true]
        boolean male = true;

        // 2. Byte
        // size: 1 byte (8 bits)
        // range: [-128, 127] [-2^7, 2^7 - 1]
        byte age = 23;

        // 2. Short
        // size: 2 bytes (16 bits)
        // range: [-2^15, 2^15 - 1]
        short height = 179; // sm

        // 3. Int
        // size: 4 bytes (32 bits)
        // range: [-2^31, 2^31 - 1]
        int seconds = 86400;

        // Long
        // size: 8 bytes (64 bits)
        // range: [-2^63, 2^63 - 1]
        long population = 8_000_000_000L; // 8 billion

        System.out.println((long) (Math.pow(2, 63) - 1));
        long unsigned = Long.parseUnsignedLong("1");
        System.out.println(unsigned);

        // Float
        // size: 4 byte
        // 6-7 decimal digits
        float weight = 60.2f;
        float f = 12345678.65118419418198985616f;
        System.out.println(f);

        // Double 64 bits
        double cost = 2783728361231231.983723988372D;
        System.out.println(cost);

        // Char 2 bytes
        char letter = 'A';
        char symbol = '\u1121'; // ᄡ
        char enter = '\n';
        char a = '\141'; // (141 in 8 = 97 in 10 = 'a')
        System.out.println("a = " + a);
        System.out.println('\\');

    }
}
