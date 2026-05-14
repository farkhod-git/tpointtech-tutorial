package com.tpointtech.multithreading;

public class ShutdownHook {
    static void main() {
        Thread shutdownHook = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(3 - i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw  new RuntimeException(e);
                }
            }

            System.out.println("Shutdown Hook");
        });

        Thread shutdownHook2 = new Thread(() -> {
            System.out.println("Removed shutdown hook");
        });

        Runtime.getRuntime().addShutdownHook(shutdownHook);
        Runtime.getRuntime().addShutdownHook(shutdownHook2);
        Runtime.getRuntime().removeShutdownHook(shutdownHook2);

        System.out.println("Main thread finished");

    }
}
