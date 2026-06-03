package com.tpointtech.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        // InputStreamReader class is used to convert byte stream into a character stream

        byte[] a1 = {49, 65, 66, 67, 50};
        byte[] a2 = "🟢❌🟡😄".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(a2));
        try (var bis = new ByteArrayInputStream(a2);
             var isr = new InputStreamReader(bis)) {

            int c;
            while ((c = isr.read()) != -1) {
//                System.out.println(c + " - " + (char) c);
                System.out.print((char) c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
