package com.tpointtech.multithreading;

public class ThreadCreation {
    static void main() {
        // Threads are lightweight units of a process
        //      that allow a program to perform multiple tasks at the same time

        // There are two ways to create a thread
        //  1. By extending Thread class
        //  2. By implementing Runnable interface

        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("MyThread is running");
            }
        }

        MyThread myThread = new MyThread();
        myThread.start();

        class MyThread2 implements Runnable {
            @Override
            public void run() {
                System.out.println("MyThread2 is running");
            }
        }

        new Thread(new  MyThread2()).start();
    }
}
