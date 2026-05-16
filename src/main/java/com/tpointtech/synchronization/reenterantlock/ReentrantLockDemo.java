package com.tpointtech.synchronization.reenterantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    static class Counter {
        private static final ReentrantLock lock = new ReentrantLock();
        private int count = 0;

        void increment() {
            // lock() method waits,
            // tryLock() throws exception if already locked by another thread
            try {
                lock.lock();

                // The thread keeps running without stopping if the monitor is busy
                // lock.tryLock();


                System.out.println("After Try: " + Thread.currentThread().getName());
                Thread.sleep(2000);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName());
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }

        public int getCount() {
            return count;
        }
    }


    static void main() throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            new Thread(counter::increment).start();
        }

        Thread.sleep(1000);
        System.out.println(counter.getCount());
    }


}
