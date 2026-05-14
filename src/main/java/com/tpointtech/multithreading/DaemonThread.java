package com.tpointtech.multithreading;

public class DaemonThread {
    static void main() throws InterruptedException {
        // example1();


        System.out.println("Example 2");

        new Thread(() -> {
            System.out.println("Example 2 thread started");

            Thread thread = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Second Daemon thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread.setDaemon(true);
            thread.start();
            thread.yield();


        }).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void example1() {
        Thread daemon = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Daemon thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw  new RuntimeException(e);
                }
            }
        });
        daemon.setDaemon(true);
        daemon.start();

        new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Simple thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw  new RuntimeException(e);
                }
            }
        }).start();
    }
}
