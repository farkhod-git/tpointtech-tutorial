package com.tpointtech.multithreading;

import java.util.concurrent.TimeUnit;

public class Multithreading {
    static void main() throws InterruptedException {
        // Multithreading is a process of executing multiple threads
        //      simultaneously within a single program

        MyThread t1 = new MyThread("First Thread");
        t1.start();
        TimeUnit.MILLISECONDS.sleep(500);
        MyThread t2 = new MyThread("Second Thread");
        t2.start();

        new Thread(new MyThread2()).start();



        // The main states of a thread

        // 1. New
        Thread thread = new Thread(() -> {
            System.out.println("New Thread");
        });

        // 2. Runnable
        // after calling star() method, the thread becomes ready and
        //      waits for CPU scheduling
        thread.start();

        // 3. Running
        // When the thread schedular picks the thread,
        //      it executes run() method

        // 4. Waiting / Blocked
        // While a thread is waiting for another thread

        // 5. Timed waiting
        // Using methods like sleep or join

        // 6. Terminated (Dead)
        // thread completes its execution ot it is stopped
        // A terminated thread cannot be restarted






    }
}

class MyThread extends Thread {
    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " THREAD " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread2 THREAD " + Thread.currentThread().getName());
    }
}