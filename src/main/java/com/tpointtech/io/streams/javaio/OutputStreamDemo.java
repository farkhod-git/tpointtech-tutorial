package com.tpointtech.io.streams.javaio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutputStreamDemo {
    public static void main(String[] args) {
        // OutputStream class is an abstract class

        byte[] content = "Hello World!".getBytes(StandardCharsets.UTF_8);

        try (FileOutputStream fos = new FileOutputStream("src/main/java/org/example/io/answer.txt")) {
            fos.write(content);
            fos.write("\n".getBytes());
            fos.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Data written successfully");
    }
}
