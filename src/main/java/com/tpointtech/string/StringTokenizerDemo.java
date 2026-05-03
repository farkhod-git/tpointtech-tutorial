package com.tpointtech.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    static void main() {
        // this is same with split method
        // delim is not regex
        StringTokenizer st = new StringTokenizer("Hello World. Where are you going?", " ");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println("---");

        StringTokenizer st2 = new StringTokenizer("Hello World. Where are you going?", " ");
        System.out.println(st2.nextToken());
//        System.out.println(st2.nextToken()); // exception
        String t = st2.nextToken(".");
        System.out.println(t);

        String t2 = st2.nextToken(".");
        System.out.println(t2);


    }
}
