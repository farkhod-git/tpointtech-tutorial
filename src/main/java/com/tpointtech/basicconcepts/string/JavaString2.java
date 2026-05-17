package com.tpointtech.basicconcepts.string;

public class JavaString2 {
    public static void main(String[] args) {
        // ===============
        // === METHODS ===
        // ===============
        lengthM();
        indexOfM();

        // equals and compareTo
        String s1 = "method";
        String s2 = "meter";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2)); // negative, zero or positive

        // concat +
        System.out.println("Apple".concat("pie"));

        String offset = new String(new char[]{'H', 'i', ' ', 'g', 'u', 'y', 's'}, 3, 4);
        System.out.println(offset);


    }

    private static void indexOfM() {
        // index of
        System.out.println("- indexOf -");
        String s = "serializable";
        System.out.println(s.indexOf('l')); // index of first l = 5
        System.out.println(s.indexOf('l', 6)); // index of first l after index 5 = 10
    }

    private static void lengthM() {
        // length() - count of characters in string
        System.out.println("Simple".length()); // UTF8 -> length = 5
        String l1 = "✈️a";
        System.out.println(l1.length());// UTF16 -> length = 3, ✈️ is 2 chars = ✈\uFE9F and 'a' one char
        String l2 = "✈\uFE0Fa";
        System.out.println(l2.length());// UTF16 -> length = 3, ✈️ is 2 chars = ✈\uFE9F and 'a' one char
    }
}
