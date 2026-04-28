package com.tpointtech.oopmisc.math;

public class FloatDemo {
    public static void main(String[] args) {
        floatBitsExample1();
        floatBitsExample2();

        extracted();
    }

    private static void extracted() {
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);

        long l1 = Double.doubleToLongBits(d1);
        long l2 = Double.doubleToLongBits(d2);

        System.out.println(Double.longBitsToDouble(l1 + l2));
    }

    private static void floatBitsExample2() {
        // 17.3

        // 17 = 10001

        // 0.3 = ?
        // 0.3 * 2 = 0.6 -> 0
        // 0.6 * 2 = 1.2 -> 1
        // 0.2 * 2 = 0.4 -> 0
        // 0.4 * 2 = 0.8 -> 0
        // 0.8 * 2 = 1.6 -> 1
        // 0.6 * 2 = 1.2 -> 0
        // ...

        // 0.3 -> 0 1001 1001 1001 1001 1001 1001 ...

        // 17.3 = 10001.010011001100110011001...

        // 17.3 = 1.73 * (10 ^ 1)
        // 10001.010011001100110011001... = 1.0001010011001100110011001... * 2 ^ 4
        // Exponent = 4 + BIAS = 4 + 127 = 131 = 10000011

        // Mantissa = 0001010011001100110011001... - must be 23 bits

        // 1 bit  8 bits     23 bits
        // [sign] [Exponent] [Mantissa]
        // 0      10000011   00010100110011001100110  -> 32 bits for float

        // result 01000001100010100110011001100110

        int i = Float.floatToIntBits(17.3f);
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i)); // result
    }

    private static void floatBitsExample1() {
        // 12.3125
        // 12 = 1100

        // 0.3125 = ?
        // 0.3125 * 2 = 0.625 -> 0
        // 0.625  * 2 = 1.25  -> 1
        // 0.25   * 2 = 0.5   -> 0
        // 0.5    * 2 = 1.0   -> 1 (1.0 or 0.0 -> stop)
        // 0101 which means
        // 0 * 2 ^ (-1) + 1 * 2 ^ (-2) + 0 * 2 ^ (-3) + 1 * 2 ^ (-4) = 0.25 + 0.0625 = 0.3125
        // 0.3125 -> 0.0101

        // 12.3125 = 1100.0101

        // 12.3125 = 1.23125 * (10 ^ 1)   [for decimal]
        // 1100.0101 = 1.1000101 * 2 ^ 3  [for binary, 3 - degree]
        // Exponent = degree + BIAS = 3 + 127 = 130 = 10000010
        // Mantissa = 1000101

        // [sign] [exponent] [mantissa]
        // 0      10000010   10001010000000000000000 -> 32 bits for float

        // result 01000001010001010000000000000000

        // check our answer
        int i = Float.floatToIntBits(12.3125f);
        System.out.println(i); // value of i is not necessary
        System.out.println(Integer.toBinaryString(i)); // this is same with our result
    }
}
