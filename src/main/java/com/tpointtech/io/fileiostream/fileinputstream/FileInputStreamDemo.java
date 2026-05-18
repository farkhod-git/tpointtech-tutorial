package com.tpointtech.io.fileiostream.fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    static void main() throws IOException {
        String filePath = "src/main/java/com/tpointtech/io/fileinputstream/file.txt";

        // read - returns next byte of stream, if next byte doesn't exist, returns -1
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char)c);
            }

            System.out.println("\n\nFILE CONTENT FINISHED\n\n");
        }

        // available - count of bytes in the file
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int available = fis.available();
            for (int i = 0; i < available; i++) {
                System.out.print((char)fis.read());
            }
            System.out.println("\n\nFILE CONTENT FINISHED 2\n\n");
        }

        // read all bytes at once
        File file = new File(filePath);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] bytes = fis.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        }

        System.out.println("\n === SKIP === \n");

        // skip()
        try (FileInputStream fis = new FileInputStream(filePath)) {
            for (int i = 0; i < 10; i++) {
                System.out.print((char)fis.read());
            }

            System.out.println();
            long skip = fis.skip(10);
            System.out.println("skip = " + skip);

            for (int i = 0; i < 10; i++) {
                System.out.print((char)fis.read());
            }
            System.out.println("\n---\n");
        }
    }
}
