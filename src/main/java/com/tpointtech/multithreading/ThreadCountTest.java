package com.tpointtech.multithreading;

public class ThreadCountTest {
    static void main() {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                while(true){
                }
            });
            t.start();
        }
    }
}
