package com.tpointtech.multithreading;

public class ThreadGroupDemo {
    static void main() {
        // A ThreadGroup is a built-in class that allows you to group multiple threads into a single unit
        //      so they can be managed together

        ThreadGroup tg = new ThreadGroup("MyThreadGroup-1");

        Runnable r = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " finished");
        };

        new Thread(tg, r).start();
        new Thread(tg, r).start();

        System.out.println(tg.activeCount());
        tg.list();

    }
}
