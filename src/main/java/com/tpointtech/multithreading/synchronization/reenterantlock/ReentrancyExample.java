package com.tpointtech.multithreading.synchronization.reenterantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrancyExample {
    // Reentrancy
    private final ReentrantLock lock = new ReentrantLock();
    private final ReentrantLock lock2 = new ReentrantLock();

    static void main() {
        ReentrancyExample example = new ReentrancyExample();
        new Thread(example::m1).start();
        new Thread(example::m2).start();
    }

    void m1() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " entered m1 method");
            Thread.sleep(2000);
            m2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void m2() {
        try {
            // Thread blocked m1() can enter m2() and create a lock again
            lock2.lock();
            System.out.println(Thread.currentThread().getName() + " entered m2 method");
        } finally {
            lock2.unlock();
        }
    }

}
