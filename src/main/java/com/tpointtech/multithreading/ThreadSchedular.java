package com.tpointtech.multithreading;

import java.util.concurrent.TimeUnit;

public class ThreadSchedular {
    static void main() {
        // The thread schedular in Java is responsible for deciding
        //      the order in which threads are executed by JVM
        // The Thread Schedular considers threads with only runnable state

        // Priority
        // Each thread has a priority between 1 and 10.
        // Threads with higher priority are more likely
        //      to be chosen by the thread schedular

        class MyThread extends Thread {
            public MyThread(String name, int priority) {
                super(name);
                setPriority(priority);
            }

            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " is running with priority " + getPriority());
            }
        }

        MyThread t1 = new MyThread("t1", 5);
        MyThread t2 = new MyThread("t2", 2);
        MyThread t3 = new MyThread("t3", 7);
        MyThread t4 = new MyThread("t4", 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Time of arrival
        // If two or more threads have same priority,
        //      thread schedular looks at the time of arrival


    }
}
