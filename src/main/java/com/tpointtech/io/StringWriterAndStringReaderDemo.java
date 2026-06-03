package com.tpointtech.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterAndStringReaderDemo {
    public static void main(String[] args) throws IOException {
        // StringWriter.
        // StringWriter is used to write character data into an internal string buffer,
        //      which can later be converted into a string

        StringWriter sw = new StringWriter();
        sw.write('a');
        sw.write('l');
        sw.write('i');

        sw.append('s')
                .append('h')
                .append('e')
                .append('r');

        System.out.println(sw);


        System.out.println("Read");
        StringReader sr = new StringReader(sw.toString());
        int b;
        while ((b = sr.read()) != -1) {
            System.out.println((char) b);
        }

        sw.close();
        sr.close();
    }
}
