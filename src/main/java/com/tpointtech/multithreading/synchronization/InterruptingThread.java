package com.tpointtech.multithreading.synchronization;

public class InterruptingThread {
    static void main() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
            }


        });

        thread.start();

        Thread.sleep(2000);
        thread.interrupt();
        System.out.println("End");
        System.out.println();
        Thread.interrupted();
        System.out.println(thread.isInterrupted());
    }
}
