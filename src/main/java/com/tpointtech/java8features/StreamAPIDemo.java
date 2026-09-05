package com.tpointtech.java8features;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newList = list.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * a)
                .toList(); // since 16
        System.out.println(newList);


    }
}
