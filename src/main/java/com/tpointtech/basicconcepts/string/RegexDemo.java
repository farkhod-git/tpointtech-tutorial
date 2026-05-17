package com.tpointtech.basicconcepts.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    static void main() {
        Pattern p = Pattern.compile("_[a-z]");
        Matcher m = p.matcher("_i");
        boolean matches = m.matches();
        System.out.println(matches);

        boolean m1 = Pattern.matches("_[a-z]", "_i");
        System.out.println(m1);

        // [abc] - a or b or c
        System.out.println(Pattern.matches("[abc]", "b"));

        // [^abc] - not (a or b or c)
        System.out.println(Pattern.matches("[^abc]", "c"));

        // [a-d[m-p]] or [a-dm-p] abcdmnop =
        System.out.println(Pattern.matches("[a-dm-p]", "c"));

        // intersection
        System.out.println(Pattern.matches("[a-d&&c-f]", "d"));


        String text = "Hi my name is Ali. I'm 23 years old. I've been working as a developer for 2 years";
        Matcher matcher = Pattern.compile("\\d+").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }

        String email = "farkhod.go@gmail.com";
        Matcher mr = Pattern.compile("([.\\w]{6,})@([a-zA-Z]+)(\\.)([a-zA-Z]+)").matcher(email);
        while (mr.find()) {
            System.out.println(mr.group());
        }


    }
}
