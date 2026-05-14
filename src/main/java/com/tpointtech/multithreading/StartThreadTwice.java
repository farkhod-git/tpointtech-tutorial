package com.tpointtech.multithreading;

public class StartThreadTwice {
    static void main() {
        Runnable runnable = () -> {
            System.out.println("thread started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread ended");
        };

        Thread thread = new Thread(runnable);

        thread.start();
        // thread.start(); // exception

        new Thread(runnable).start(); // it works
    }
}
