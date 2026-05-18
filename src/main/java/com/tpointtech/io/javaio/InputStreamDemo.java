package com.tpointtech.io.javaio;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/java/org/example/io/inputoutput/answer.txt")) {
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
