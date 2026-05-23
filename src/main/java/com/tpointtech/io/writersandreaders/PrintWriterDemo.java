package com.tpointtech.io.writersandreaders;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    static void main() throws IOException {

        String file = "src/main/java/com/tpointtech/io/writersandreaders/print-writer.txt";

        try (var aw = new CharArrayWriter();
             var pw = new PrintWriter(aw);
             var fw = new FileWriter(file)) {

            // pw -> aw
            // aw -> fw

            pw.println("This is a line");
            pw.println(1234);
            pw.println(true);
            pw.println(123.234D);
            pw.print("Last line");

            aw.writeTo(fw);
        }

        try (var pw = new PrintWriter(System.out)) {
            pw.println("This is a line");
            pw.println(1234);
            pw.println(true);
            pw.println(123.234D);
        }

    }
}
