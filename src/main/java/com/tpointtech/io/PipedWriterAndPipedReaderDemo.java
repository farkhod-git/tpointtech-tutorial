package com.tpointtech.io;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterAndPipedReaderDemo {
    public static void main(String[] args) throws IOException {

        // Piped writer generally used for communication between two threads,
        //      where one thread writes character data using PipedWriter
        //      and another thread reads that data using PipedReader


        PipedReader read = new PipedReader();
        PipedWriter write = new PipedWriter(read);


        Thread readerThread = new Thread(() -> {
            try {
                int data;
                System.out.println("Reading Started");
                while ((data = read.read()) != -1) {
                    System.out.print((char) data);
                }
                System.out.println("Reading ended");
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
                write.write("I love my country\n".toCharArray());
                // when write closed, read stopped waiting and read() method returns -1
                write.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        readerThread.start();
        writerThread.start();

//        read.close();
//        write.close();
    }
}
