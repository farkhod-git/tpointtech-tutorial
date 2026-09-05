package com.tpointtech.java8features;

import java.util.Optional;
import java.util.Random;

public class OptionalClassDemo {
    static void main() {

        Random random = new Random();
        Optional<Integer> optional;
        if (random.nextBoolean()) {
            optional = Optional.of(random.nextInt(100));
        } else {
            optional = Optional.empty();
        }

        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("No value present");
        }
    }
}
