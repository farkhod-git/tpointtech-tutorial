package com.tpointtech.string;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JavaStringMethods {
    public static void main(String[] args) {
        String s = "Hello";

        char charAt = s.charAt(1);
        System.out.println(charAt); // e

        int length = s.length();
        System.out.println(length);

        String temp = "My name is %s, I am %d years old";
        String format = temp.formatted("Ali", 23);
        System.out.println(format);

        String ftCh = String.format(Locale.CHINESE, temp, "Ali", 23);
        System.out.println(ftCh);

        formatString();

        String s1 = "Literature";
        String s2 = "rat";
        boolean rat = s1.contains(s2);
        System.out.println(rat);

        String join = String.join(", ", "A1", "B2", "C3");
        System.out.println(join);

        boolean equals = s1.equals(s2);
        System.out.println(equals);

        String upperCase = s1.toUpperCase();
    }

    private static void formatString() {

        System.out.println("=== FORMATTING ===");

        String f1 = "any value [%s, %s, %s]".formatted(1, true, "ABC");
        System.out.println(f1);

        String f2 = "float [%f]".formatted(10.4567f); // [%.5f]
        System.out.println(f2);

        String f3 = "float [%8.2f]".formatted(10.4567f);
        System.out.println(f3);

        String f4 = "I am %d years old".formatted(23);
        System.out.println(f4);

        String f5 = "%x hexadecimal".formatted(27);
        System.out.println(f5);

        String f6 = "letter %c".formatted('A');
        System.out.println(f6);

        // Week name
        Date d = new Date();
        String f7 = """
            week: %tA
            month: %tB
            day of month: %td
            month: %tm
            Year: %tY
            hour: %tH
            minute: %tM
            second: %tS""".formatted(d, d, d, d, d, d, d, d);
        System.out.println(f7);



    }
}
