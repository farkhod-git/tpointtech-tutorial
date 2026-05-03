package com.tpointtech.string.problems;

import java.util.StringTokenizer;

public class CapitalizeEachWord {
    static void main() {
        String str = "Hello World. Where are you going?";
        String cap = capitalizeEachWord1(str);
        System.out.println(cap);

        String cap2 = capitalizeEachWord2(str);
        System.out.println(cap2);

    }

    static String capitalizeEachWord1(String text) {
        char[] a = text.toCharArray();
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] == ' ' && a[i] != ' ') {
                a[i] = Character.toUpperCase(a[i]);
            }
        }
        return new String(a);
    }

    static String capitalizeEachWord2(String text) {
        StringTokenizer st = new StringTokenizer(text, " ");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            sb.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
            .append(' ');
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }


}
