package com.tpointtech.io.writersandreaders;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    static void main() throws IOException {

        String file = "src/main/java/com/tpointtech/io/writersandreaders/filewriter.txt";
        try (FileWriter fw = new FileWriter(file)) {
            int a = 'a';
            fw.write(a);

            fw.write("\nHello World");

            fw.write("\n");
            char[] chars = new char[]{'F', 'a', 'r', 'k', 'h', 'o', 'd'};
            fw.write(chars);

            fw.write("\n");
            fw.write(chars, 3, chars.length - 3);
        }

    }
}
