package com.tpointtech.basicconcepts.string.problems;

public class ReverseEachWord {
    static void main() {
        String rev1 = reverseEachWord1("Hello World. Where are you going?");
        System.out.println(rev1);

        System.out.println(reverseEachWord2("Hello World. Where are you going?"));

        // new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("");
    }

    static String reverseEachWord1(String str) {
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            int wl = word.length();
            for (int i = 0; i < wl; i++) {
                sb.append(word.charAt(wl - 1 - i));
            }
            sb.append(' ');
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    static String reverseEachWord2(String str) {
        char[] a = str.toCharArray();
        int lastSpaceAt = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                reverse(a, lastSpaceAt, i - 1);
                lastSpaceAt = i + 1;
            }
        }

        reverse(a, lastSpaceAt, a.length - 1);

        return new String(a);
    }

    static void reverse(char[] a, int b, int e) {
        while (b < e) {
            char temp = a[b];
            a[b] = a[e];
            a[e] = temp;
            b++;
            e--;
        }
    }
}
