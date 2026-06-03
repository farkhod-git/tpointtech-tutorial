package com.tpointtech.io;

import java.io.*;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        // PushbackReader is used to read data from a reader with the ability to push back bytes
        //      that have already been read

        char[] bytes = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        try (var bis = new CharArrayReader(bytes);
             var pbs = new PushbackReader(bis, 5)) { // push back buffer size = 5

            char read = (char) pbs.read();
            System.out.println(read);

            pbs.unread(read);
            pbs.unread('9');
            pbs.unread('8');
            pbs.unread('7');
            pbs.unread('6');
            // pbs.unread('5'); // exception

            int b;
            while ((b = pbs.read()) != -1) {
                System.out.print((char)b);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
