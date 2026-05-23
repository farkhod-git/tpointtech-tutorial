package com.tpointtech.io.bytearray;

import java.io.*;

public class ByteArrayOutputStreamDemo {
    static void main() {
        // The byte array output stream class writes data into an internal
        //      byte array instead of directly writing it to a file.
        // The stored data in byte array output stream can be
        //      written to multiple output streams later

        String basePath = "src/main/java/com/tpointtech/io/bytearray";
        String filePath1 = basePath + "/file1.txt";
        String filePath2 = basePath + "/file2.txt";

        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {

            // write to byte stream
            os.write("First data\n".getBytes());

            // write byte stream to the first file
            try (FileOutputStream fos = new FileOutputStream(filePath1);) {
                os.writeTo(fos);
            }

            // append second data to the byte stream
            os.write("Second data\n".getBytes());

            // write byte stream to the second file
            try (var fos = new FileOutputStream(filePath2);
                 var bos = new BufferedOutputStream(fos)) {

                os.writeTo(bos);
            }

            System.out.println(os);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
