package com.tpointtech.multithreading.synchronization.reenterantlock;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {
    private final ReentrantLock lock = new ReentrantLock();

    static void main() {
        TryLockDemo tl = new TryLockDemo();
        new Thread(tl::a).start();
        new Thread(tl::a).start();
    }

    void a() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " could get lock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " finished work");
            lock.unlock();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " could not get lock");
        }
    }
}
