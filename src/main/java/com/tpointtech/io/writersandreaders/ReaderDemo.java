package com.tpointtech.io.writersandreaders;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ReaderDemo {
    static void main() {
        String file = "src/main/java/com/tpointtech/io/writersandreaders/writer.txt";
        try (Reader reader = new FileReader(file)) {

            List<String> lines = reader.readAllLines();
            lines.forEach(System.out::println);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
