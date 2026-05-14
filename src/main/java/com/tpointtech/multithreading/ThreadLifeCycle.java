package com.tpointtech.multithreading;

import java.util.concurrent.TimeUnit;

public class ThreadLifeCycle {
    static void main() throws InterruptedException {
        // NEW - created but not started yet
        Thread thread = new Thread(() -> System.out.println("New thread"));

        // RUNNABLE - maybe running or maybe ready to run
        thread.start();

        // BLOCKED - when a thread enter to synchronized block or method already locked by another thread
        // Main thread invokes the join method it waits for the child threads to complete their tasks


        Thread mainThread = Thread.currentThread();


        Thread th1 = new Thread(() -> {
            System.out.println(mainThread.getState());

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("New thread finished");
        });
        th1.start();

        // When th1 Thread sleeps 2 seconds
        //      its state is TIMED_WAITING
        TimeUnit.SECONDS.sleep(1);
        System.out.println(th1.getState());

        // Main thread waits 2 seconds
        // State of Main thread will be WAITING
        th1.join();
        // Then again state will be RUNNABLE

        // th1 finished its work so th1 is TERMINATED
        System.out.println(th1.getState());

        System.out.println("Main thread finished");
    }
}
