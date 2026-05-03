package com.tpointtech.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringConcatenation {
    public static void main(String[] args) {
        String a = "A".concat("B");
        String b = "A" + "B";

        String join = String.join(", ", "Alisher", "Farkhod");
        System.out.println(join);


        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array
        String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
        System.out.println(str);  //Displays result

        String substring = "Computer".substring(0, 3);
        System.out.println(substring);

        String[] split = "Hi Hello World Coder".split(" ");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
