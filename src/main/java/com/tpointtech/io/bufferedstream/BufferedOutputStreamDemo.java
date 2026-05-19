package com.tpointtech.io.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    static void main() throws IOException {
        // BufferedOutputStream adds a buffering mechanism to an output stream
        // Instead of writing data directly to the destination,
        //      it first stores the data in a buffer and then writes it in larger chunks.

        final String filePath = "src/main/java/com/tpointtech/io/bufferedstream/file.txt";
        try (FileOutputStream fos = new FileOutputStream(filePath);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            String data = "Hello World! Buffered Stream example.";
            bos.write(data.getBytes());
        }

        // Small Files - FileOutputStream
        // Large Files - BufferedOutputStream
    }
}
