package com.tpointtech.multithreading;

public class ThreadSleep {
    static void main() throws InterruptedException {

        // Thread sleeps 2s. State of Thread will be TIMED_WAITING
        // During this period, the thread doesn't consume CPU resources
        // After 2s Thread will be RUNNABLE again and waits for the thread schedular to pick it for execution
        // Thread.sleep(2000);

        Thread thread = new Thread(() -> {
            try {
                System.out.println("thread started sleeping");
                Thread.sleep(5000);
                System.out.println("thread finished sleeping");
            } catch (InterruptedException e) {
                System.out.println("thread interrupted");
            }
        });

        thread.start();

        try {
            Thread.sleep(2000);
            thread.interrupt();

            System.out.println("thread info");
            System.out.println(thread.isInterrupted());
            System.out.println(thread.isAlive());
            System.out.println(thread.getState());
        }  catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
