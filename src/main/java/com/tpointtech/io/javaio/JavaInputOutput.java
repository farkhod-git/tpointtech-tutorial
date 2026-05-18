package com.tpointtech.io.javaio;

import java.io.IOException;

public class JavaInputOutput {
    public static void main(String[] args) throws IOException {
        // Java I/O is used to read data from input sources and write data to output destinations

        // Java I/O is based on two main concepts

        // 1. Streams - represents a continuous flow of data
        //      - Input Streams used to read data from a source
        //      - Output Streams used to write data to a destination

        // Byte Streams - InputStream, OutputStream
        // Character Streams - Reader, Writer

        // 2. Readers/Writers - work with text data
        //  Readers are used to read character data
        //  Writers are used to write character data

        // Java automatically creates three standard streams
        //      1. System.out - Standard output stream
        //      2. System.in - Standard input stream
        //      3. System.err - Standard error stream



        // System.out
        System.out.println("Hello World");

        // read from console
        int ch = System.in.read();
        System.out.println("You write " + ((char) ch));
    }
}
