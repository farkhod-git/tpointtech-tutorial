package com.tpointtech.java8features;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {
    static void main() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        Double avg = list.stream()
                .collect(Collectors.averagingInt(a -> a));
        System.out.println(avg);

        Map<Integer, List<Integer>> group = list.stream()
                .collect(Collectors.groupingBy(item -> item % 4));
        System.out.println(group);

        String numbers = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" -> "));
        System.out.println(numbers);

        long count = list
                .stream()
                .filter(a -> a % 4 == 0)
                .distinct()
                .count();
        System.out.println(count);


    }
}
