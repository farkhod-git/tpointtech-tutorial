package com.tpointtech.io.writersandreaders;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    static void main() {
        // The Writer Class is an abstract class using for writing character streams
        try (Writer writer = new FileWriter("src/main/java/com/tpointtech/io/writersandreaders/writer.txt")) {
             writer.write("I love my country! 1\n");
             writer.write("I love my country! 2\n");
             writer.write("I love my country! 3\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
