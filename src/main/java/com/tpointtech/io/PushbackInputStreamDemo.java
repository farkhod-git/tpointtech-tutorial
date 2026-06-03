package com.tpointtech.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        // PushbackInputStream is used to read data from an input stream with the ability to push back bytes
        //      that have already been read

        byte[] bytes = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        try (var bis = new ByteArrayInputStream(bytes);
             var pbs = new PushbackInputStream(bis, 5)) { // push back buffer size = 5

            char read = (char) pbs.read();
            System.out.println(read);

            pbs.unread(read);
            pbs.unread('1');
            pbs.unread('2');
            pbs.unread('3');
            pbs.unread('4');
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
