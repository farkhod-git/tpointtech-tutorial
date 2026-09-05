package com.tpointtech.java8features;

import java.util.StringJoiner;

public class StringJoinerDemo {
    static void main() {
        // StringJoiner, 1.8
        // StringBuilder 1.5
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("Hello");
        sj.add("World");
        System.out.println(sj);
    }
}
