package com.tpointtech.io.writersandreaders;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriterDemo {
    static void main() throws IOException {

        // The OutputStreamWriter class in java is used to convert a character stream
        //      into a byte stream using specified character encoding.

        // OutputStreamWriter class acts a bridge between character streams and byte streams
        //      , and it is used to encode characters into bytes using a specified charset

        // To performance, OutputStreamWriter is commonly used with BufferedWriter

        String file = "src/main/java/com/tpointtech/io/writersandreaders/output-stream-writer.txt";
        try (var fos = new FileOutputStream(file);
             Writer writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {

            writer.write("Hello World 🗺️⛔︎");

        }


    }
}
