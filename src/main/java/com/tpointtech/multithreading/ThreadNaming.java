package com.tpointtech.multithreading;

import java.util.Random;

public class ThreadNaming {
    static void main() {

        System.out.println(Thread.currentThread().getName());

        Runnable runnable = () -> {

            int i = new Random().nextInt(100, 1000);
            for (int j = 0; j < 10; j++) {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName());
        };
        Thread th1 = new Thread(runnable);
        th1.setPriority(1);
        th1.setName("First");
        th1.start();
        Thread th2 = new Thread(runnable, "Second");
        th2.setPriority(4);
        th2.start();
        Thread th3 = new Thread(runnable);
        th3.setPriority(9);
        th3.start();



    }
}
