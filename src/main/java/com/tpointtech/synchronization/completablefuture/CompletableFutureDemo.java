package com.tpointtech.synchronization.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {
    static void main() {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
        try (ExecutorService executor = Executors.newFixedThreadPool(processors)) {
            CompletableFuture.supplyAsync(() -> {
                        sleep(200);
                        System.out.println(Thread.currentThread().getName() + " - hello");
                        return "hello";
                    }, executor)
                    .thenApplyAsync(v -> {
                        sleep(2000);
                        System.out.println(Thread.currentThread().getName() + " -- " + v);
                        return v + "world";
                    })
                    .thenAcceptAsync(System.out::println);

            CompletableFuture.runAsync(() -> {
                sleep(2000);
                System.out.println(Thread.currentThread().getName());
            });

            System.out.println("END");
            sleepInSeconds(4);
        }


    }

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void sleepInSeconds(long seconds) {
        sleep(seconds * 1000);
    }
}
