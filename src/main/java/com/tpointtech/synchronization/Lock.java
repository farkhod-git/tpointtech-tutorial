package com.tpointtech.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    private static ReentrantLock lock = new ReentrantLock();

    static void main() {
        try {
            lock.lock();

            System.out.println("main");

        } finally {
            lock.unlock();
        }

    }
}
