package com.tpointtech.io.filehandling;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class JavaRandomAccessFile {
    static void main() {
        // The RandomAccessFile class is used to read and write to a file at any position.
        String r = "rw"; // r, wr
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("src/main/java/com/tpointtech/filehandling/files/random-access-file.txt", r)) {
            randomAccessFile.seek(30);

            randomAccessFile.writeBytes("Hello World");

            byte[] bytes = new byte[10];
            randomAccessFile.read(bytes);

            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
