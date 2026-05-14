package com.tpointtech.synchronization;

import java.util.concurrent.TimeUnit;

public class SynchronizationInJava {
    static void main() throws InterruptedException {
        // Synchronization in java is a mechanism that controls access to share resources
        //      to prevent data inconsistency in multithreaded programs

        class Counter {
            private int count = 0;

            public void inc() {
                count++;
            }

            public void dec() {
                count--;
            }

            public int getCount() {
                return count;
            }
        }

        Counter counter = new Counter();

        // When Two threads increment simultaneously, both may read same value of count
        //  one update can override other.
        // This situation is known as race condition

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    counter.inc();
                }
            });
            thread.start();
        }

        // wait for threads to finish their work
        TimeUnit.SECONDS.sleep(1);

        // We expect 10_000
        // But we get x <= 10_000
        System.out.println(counter.getCount());

        // Java provides two primary mechanism for synchronization
        //  1. Synchronized Methods
        //  2. Synchronized Blocks

        class SynchronizedCounter {
            private int count = 0;

            public synchronized void inc() {
                count++;
            }

            public int getCount() {
                return count;
            }
        }

        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    synchronizedCounter.inc();
                }
            });
            thread.start();
        }

        // wait for threads to finish their work
        TimeUnit.SECONDS.sleep(1);

        // We always get 10_000
        System.out.println(synchronizedCounter.getCount());

        // Synchronized Blocks
        class SynchronizedCounter2 {
            private int count = 0;

            public void inc() {
                // Two threads cannot get access this object simultaneously
                synchronized (this) {
                    count++;
                }
            }

            public int getCount() {
                return count;
            }
        }

        SynchronizedCounter2 synchronizedCounter2 = new SynchronizedCounter2();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    synchronizedCounter2.inc();
                }
            });
            thread.start();
        }

        // wait for threads to finish their work
        TimeUnit.SECONDS.sleep(1);

        // We always get 10_000
        System.out.println(synchronizedCounter2.getCount());

        // Cooperation (notify(), notifyAll(), wait())
        class Restaurant {
            public boolean foodReady = false;

            synchronized void prepareFood() {
                System.out.println("Cook is preparing food...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                foodReady = true;
                notify();
            }

            synchronized void serveFood() {
                System.out.println("A");
                while (!foodReady) {
                    System.out.println("Customer is waiting for food...");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Customer is serving food...");
            }
        }

        Restaurant restaurant = new Restaurant();

        new Thread(restaurant::serveFood).start();
        new Thread(restaurant::prepareFood).start();

    }
}
