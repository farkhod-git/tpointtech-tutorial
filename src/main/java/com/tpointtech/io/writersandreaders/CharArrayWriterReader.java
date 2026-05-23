package com.tpointtech.io.writersandreaders;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterReader {
    static void main() throws IOException {

        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        try (var ar = new CharArrayReader(chars)) {
            // position 0 marked can be reset
            ar.mark(100); // return back length limit

            int c;
            while ((c = ar.read()) != -1) {
                System.out.print((char) c);
            }

            ar.reset();

            while ((c = ar.read()) != -1) {
                System.out.print((char) c);
            }
        }

        String file = "src/main/java/com/tpointtech/io/writersandreaders/char-array-writer.txt";
        try (var w = new FileWriter(file);
             var aw = new CharArrayWriter()) {
            aw.write(chars);
            aw.write('A');
            aw.write('B');
            aw.write('C');
            aw.writeTo(w);
        }

    }
}
