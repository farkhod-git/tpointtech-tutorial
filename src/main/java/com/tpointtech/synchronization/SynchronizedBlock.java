package com.tpointtech.synchronization;

public class SynchronizedBlock {
    static void main() throws InterruptedException {
        class Sender {
            public int sendCount = 0;

            void send(String msg) {
                // System.out.println(Thread.currentThread().getName() + " is sending " + msg);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                sendCount++;
            }
        }

        class SenderThread extends Thread {
            final String msg;
            final Sender sender;

            SenderThread(String msg, Sender sender) {
                this.msg = msg;
                this.sender = sender;
            }

            @Override
            public void run() {
                // code...

                  synchronized (sender) {
                    sender.send(msg);
                 }

                // code...
            }
        }

        Sender sender = new Sender();

        Thread last = null;
        for (int i = 0; i < 100; i++) {
            last = new SenderThread("message " + i, sender);
            last.start();
        }

        last.join();

        System.out.println(sender.sendCount);
    }
}
