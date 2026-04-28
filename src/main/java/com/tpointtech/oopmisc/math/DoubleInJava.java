package com.tpointtech.oopmisc.math;

public class DoubleInJava {
    public static void main(String[] args) {
        // 11.125

        // convert to binary
        // 11 -> 1011

        // 0.125 - 1 / 2^3
        // 0.125 * 2 = 0.25 -> 0
        // 0.25 * 2 = 0.5   -> 0
        // 0.5 * 2 = 1      -> 1
        // 0.125 -> 001 -> 0 * 2 ^ (-1) + 0 * 2 ^ (-2) + 1 * 2 ^ (-3) = 1 / 8

        // 11.125 -> 1011.001 (converted)

        // normalize
        // 1011.001 = 1.011001 * 2 ^ 3

        // sign = 0
        // exponent = 3 -> stored as 3 + 127 = 130 -> binary 10000010
        // mantissa = after 1. in 1.011001 = 01100100000000000000000

        // [sign] [exponent] [mantissa]
        // 0 10000010 01100100000000000000000

        System.out.println(Long.parseLong("0111", 2));
        // signed 0
        // exponent 129
        // mantissa 3670016

        // 1.7 * 2 ^ (129 - 127) = 1.3670016 * 4

        System.out.println(1.7 * 4);


        // FLOAT

        // exponent - power of two - (positive or negative)
        // 8 bits - 1 bit sign 7 bits value

    }
}
