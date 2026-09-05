package com.tpointtech.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class LambdaExpressionDemo {
    static void main() {
        lambdaExpression();
    }

    private static void lambdaExpression() {
        // Lambda expressions
        List<String> languages = Arrays.asList("C", "C#", "Java", "Python", "JavaScript", "C++");
        filter(languages, l -> l.startsWith("C"));

        // Method reference
        // 1. Static method reference
//        Function<String, Integer> length = (s) -> s.length();
        Function<String, Integer> length = String::length;

        // 2. instance method reference
        Random random = new Random();
//        Supplier<Integer> randomNumber = () -> random.nextInt();
        Supplier<Integer> randomNumber = random::nextInt;

        System.out.println(length.apply("Hello"));
        System.out.println(randomNumber.get());

        // Constructor method reference
        Supplier<Random> newRandom = Random::new;
    }

    private static void filter(List<String> languages, Predicate<String> condition) {
        for (String language : languages) {
            if (condition.test(language)) {
                System.out.println(language);
            }
        }
    }
}
