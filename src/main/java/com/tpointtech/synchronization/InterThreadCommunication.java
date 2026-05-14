package com.tpointtech.synchronization;

public class InterThreadCommunication {
    static void main() {

        // wait() - waits until other thread notify it
        // notify() - notify a waiting thread
        // notifyAll() - notify all waiting threads

        class Customer {
            int amount = 10000;

            //creating a withdraw() method which calls the wait() method
            synchronized void withdraw(int amount) {
                System.out.println("going to withdraw...");

                if (this.amount < amount) {
                    System.out.println("Less balance; waiting for deposit...");
                    try {
                        wait();
                    } catch (Exception _) {
                    }
                }
                this.amount -= amount;
                System.out.println("withdraw completed...");
            }

            //creating a deposit() method with calls the notify() method
            synchronized void deposit(int amount) {
                System.out.println("going to deposit...");
                this.amount += amount;
                System.out.println("deposit completed... ");
                notify();
            }
        }

        Customer customer = new Customer();
        new Thread(() -> {
            System.out.println("Waiting for deposit...");
            customer.withdraw(50_000);
            System.out.println("Customer is withdrawn...");
        })
                .start();

        new Thread(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            customer.deposit(50_000);
        }).start();

    }
}
