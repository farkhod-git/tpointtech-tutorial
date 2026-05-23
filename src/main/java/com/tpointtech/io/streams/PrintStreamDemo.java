package com.tpointtech.io.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    static void main() throws IOException {

        // PrintStream class is used to write formatted and unformatted data
        //  to another output stream

        String file = "src/main/java/com/tpointtech/io/streams/print-stream.txt";
        try (PrintStream ps = new PrintStream(new FileOutputStream(file))) {

            ps.println("Hello World");
            ps.print(true);
            ps.format("My name is %s.", "Alisher");
            ps.printf("This is a %s.", "Format");

        }


    }
}
