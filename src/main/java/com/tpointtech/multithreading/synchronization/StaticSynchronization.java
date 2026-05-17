package com.tpointtech.multithreading.synchronization;

public class StaticSynchronization {
    static void main() throws InterruptedException {
        class Printer {

            static int count = 0;

            static synchronized void print() {
                count++;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Hello " + " " + count);
            }

            static void print2() {
                synchronized (Printer.class) {
                    count++;
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Hello " + " " + count);
            }
        }

        for (int i = 0; i < 10; i++) {
            new Thread(Printer::print).start();
        }
        Thread.sleep(2000);
        System.out.println(" - ");

        for (int i = 0; i < 10; i++) {
            new Thread(Printer::print2).start();
        }
    }
}

sealed class A permits B, C {
}

final class B extends A {
}

final class C extends A {
}


