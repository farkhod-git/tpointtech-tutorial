package com.tpointtech.multithreading;

public class JoiningThreads {
    static void main() {
        // join() method
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        });

        thread.start();
        try {
            System.out.println("Current thread is waiting for thread");
            thread.join();
            System.out.println("thread finished");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Current thread finished");

        System.out.println("= ".repeat(20));

        // join(milliseconds) method
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
            System.out.println("thread1 finished.");
        });

        thread1.start();
        try {
            System.out.println("Current thread started to wait for thread1 2 seconds");
            thread1.join(2000);
            System.out.println("Current thread stopped to wait thread1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // join(millisecond, nanos)
        // like join(milliseconds)
    }
}
