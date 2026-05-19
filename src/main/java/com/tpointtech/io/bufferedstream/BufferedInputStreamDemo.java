package com.tpointtech.io.bufferedstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    static void main() throws Exception {

        final String filePath = "src/main/java/com/tpointtech/io/bufferedstream/file.txt";
        try (FileInputStream fis = new FileInputStream(filePath);
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            byte[] bytes = bis.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);

        }

    }
}
