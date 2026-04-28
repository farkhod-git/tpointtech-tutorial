package com.tpointtech.oopmisc.math;

public class JavaMathClass {
    public static void main(String[] args) {
        // m1();

        // natural logarithm (base e)
        double log = Math.log(Math.pow(Math.E, 8));
        System.out.println(log); // 8

        // base 10 logarithm
        double log10 = Math.log10(1000);
        System.out.println(log10);

        // log(a + 1)
        double log1p = Math.log1p(Math.E - 1);
        System.out.println(log1p);

        // power of E
        double exp = Math.exp(2);
        System.out.println(exp);

        //
        double v = Math.expm1(1);
        System.out.println(v);

        //
        double degrees = Math.toDegrees(3.14);
        System.out.println(degrees);

        double radians = Math.toRadians(360);
        System.out.println(radians);
    }

    private static void m1() {
        // absolute
        int abs = Math.abs(-2); // 2

        // max
        int max = Math.max(3, 6); // 6

        // min
        int min = Math.min(3, 6); // 3

        // round = ~
        long round1 = Math.round(1.3); // 1
        long round2 = Math.round(1.5); // 2
        long round3 = Math.round(1.8); // 2
        System.out.println(round1 + " - " + round2 + " - " + round3);

        // sqrt - the square root of a number
        double sqrt = Math.sqrt(16); // 4.0

        // cbrt - the cube root of a number
        double cbrt = Math.cbrt(27); // 3.0
        System.out.println(cbrt);

        // pow(arg1, arg2) - the value of first argument raised to the second argument
        double pow = Math.pow(3, 4); // 3 * 3 * 3 * 3 = 81

        // 0x...
        int fromHex = 0xA; // 10
        System.out.println(fromHex);

        // (C)16 * 2 ^ (-7) // C = 12
        // 12 * (1 / (2 ^ 7))
        // 12 / 128 = 3 / 32 = 0.09375
        double hex = 0xCp-7; // 0.09375
        System.out.println(hex);

        double hex2 = 0xAp6; // A * (2 ^ 6) = 10 * 64 = 640
        System.out.println(hex2); // 640

        System.out.println(null == null); // true

        // signum
        double signumP = Math.signum(16.25); // 1 - positive
        double signumN = Math.signum(-11.2); // -1 - negative
        double signum = Math.signum(0); // 0 - 0
        System.out.println("SIGNUM: " + signumP + " - " + signumN + " - " + signum);

        // ceil
        double ceil1 = Math.ceil(12.0);
        double ceil2 = Math.ceil(12.2);
        double ceil3 = Math.ceil(12.5);
        double ceil4 = Math.ceil(12.8);
        double ceil5 = Math.ceil(13.0);
        System.out.println(ceil1 + " - " + ceil2 + " - " + ceil3 + " - " + ceil4 + " - " + ceil5);

        // Infinity
        double d1 = 12 / 0.0; // Infinity
        double d2 = 12 / 0.0; // Infinity
        double d3 = 0.0 / 0; // NaN
        double d4 = 0.0 / 0; // NaN
        System.out.println(d1);
        System.out.println(d3);
        System.out.println(d1 == d2); // true which means Infinity equals Infinity
        System.out.println(d3 == d4); // false which means NaN doesn't equal NaN

        // copySign - this method moves sign of the second number to the first number
        double copySign = Math.copySign(12.3, -2); // -12.3
        System.out.println(copySign);

        // nextAfter
        double nextAfter = Math.nextAfter(1.2, -2.3); // left adjacent (-2.3 < 0) of 1.2 -> 1.1999999999999997
        double nextAfter2 = Math.nextAfter(1.2, 4.7); // right adjacent (4.7 > 0) of 1.2 -> 1.2000000000000002
        System.out.println(nextAfter);
        System.out.println(nextAfter2);

        double ddd = 1.2000000000000001; // this number doesn't exist, but 1.2000000000000002 exists
        System.out.println(ddd); // so 1.2000000000000002


        // nextUp - next adjacent of number
        System.out.println(Math.nextUp(1.2)); // 1.2000000000000002

        // nextDown - prev adjacent of number
        System.out.println(Math.nextDown(1.2)); // 1.1999999999999997

        // double
        // (x + 1 / 2^y)

        // test
        System.out.println("ADJACENT NUMBERS");
        double an = 1.0;
        for (int i = 0; i < 10; i++) {
            an = Math.nextUp(an);
            System.out.println(an);
        }

        System.out.println(Math.nextUp(1000000.0));

        System.out.println(0.1 + 0.2);
        System.out.println(Math.nextUp(0.1 + 0.2));
        System.out.println(Math.nextDown(0.1 + 0.2));
        System.out.println(0.3);
        System.out.println(Math.nextUp(0.3));
        System.out.println(Math.nextDown(0.3));

        System.out.println();
        Long l = Long.valueOf("0000000000001100110011001100110011001100110011001100110011001100", 2);
        System.out.println(l);
        l++;
        System.out.println(Long.toBinaryString(l));

        // floor (<-> ceil)
        double floor = Math.floor(1.6);// 6

        int floorDiv = Math.floorDiv(13, 4); // Math.floor(13.0 / 4.0)
        double floor1 = Math.floor(13.0 / 4.0);
        System.out.println(floorDiv);
        System.out.println(floor1);

        // random
        double random = Math.random(); // random number between 0.0 and 1.0

        double hypot = Math.hypot(3, 4); // sqrt(3 ^ 2 + 4 ^ 2)
        System.out.println(hypot);

        double ulp = Math.ulp(0.3);
        System.out.println(ulp);

        int exponent = Math.getExponent(12.3125f); // 3 + 127 = 130
        System.out.println(exponent);

        double ieeeRemainder = Math.IEEEremainder(1.2, 0.3);
        System.out.println(ieeeRemainder);

//        int add1 = Math.addExact(Integer.MAX_VALUE, 30);
//        System.out.println(add1);

        int i = Math.incrementExact(Integer.MAX_VALUE);
        System.out.println(i);


    }
}
