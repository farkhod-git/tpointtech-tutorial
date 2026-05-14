package com.tpointtech.synchronization;

public class DeadLock {
    static void main() throws InterruptedException {
        avoidDeadLock();
        deadlock();
    }

    private static void deadlock() {
        final String resource1 = "foo";
        final String resource2 = "bar";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");   // first print statement
                try {
                    Thread.sleep(100);
                } catch (Exception _) {
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");   // second print statement
                }
            }
        });
        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");    // third print statement
                try {
                    Thread.sleep(100);
                } catch (Exception _) {
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");    // fourth print statement
                }
            }
        });

        t1.start();

        // t1.join();

        t2.start();
    }

    private static void avoidDeadLock() throws InterruptedException {
        class resource1 {
            private int i = 10;
            public int getI() {
                return i;
            }
            public void setI(int i) {
                this.i = i;
            }
        }

        class resource2 {
            private int i = 20;
            public int getI() {
                return i;
            }
            public void setI(int i) {
                this.i = i;
            }
        }

        final resource1 a = new resource1();
        final resource2 b = new resource2();
        // Thread - 1
        Runnable t1 = () -> {
            synchronized (b) {
                try {
                    /* Adding delay so that both threads can start trying to lock resources */
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Thread - 1 have resource2 but need resource1 also
                synchronized (a) {
                    System.out.println("In block 1");
                }
            }
        };
        // Thread - 2
        Runnable t2 = () -> {
            synchronized (b) {
                // Thread - 2 have resource2 but need resource1 also
                synchronized (a) {
                    System.out.println("In block 2");
                }
            }
        };
        new Thread(t1).start();    // first thread
        new Thread(t2).start();    // second thread
    }
}
