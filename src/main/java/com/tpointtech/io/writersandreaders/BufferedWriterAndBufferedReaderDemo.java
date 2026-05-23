package com.tpointtech.io.writersandreaders;

import java.io.*;

public class BufferedWriterAndBufferedReaderDemo {
    static void main() throws IOException {

        String file = "src/main/java/com/tpointtech/io/writersandreaders/buffered-writer.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("Write buffered texts");
            bw.newLine(); // good
            bw.write("Third line");
        }

        try (var br = new BufferedReader(new FileReader(file))) {
            System.out.println("br.readAllAsString() = " + br.readAllAsString());
        }

        System.out.println("=== Read line by line ===");

        try (var br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

    }
}
