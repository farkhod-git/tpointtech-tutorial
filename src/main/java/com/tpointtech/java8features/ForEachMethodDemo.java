package com.tpointtech.java8features;

import java.util.List;
import java.util.Map;

public class ForEachMethodDemo {
    static void main() {
        Iterable<String> iterable = List.of("Apple", "Banana", "Cherry");
        iterable.forEach(System.out::println);

        Map<String, Integer> map = Map.of("Apple", 1, "Banana", 2, "Cherry", 3);
        map.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
