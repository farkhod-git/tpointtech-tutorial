package com.tpointtech.io.sequenceinputstream;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    static void main() throws IOException {
        Enumeration<InputStream> elements = getElements();

        try (SequenceInputStream sis = new SequenceInputStream(elements)) {
            byte[] bytes = sis.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        }
    }

    private static Enumeration<InputStream> getElements() throws FileNotFoundException {
        FileInputStream fis1 = new FileInputStream("src/main/java/com/tpointtech/io/sequenceinputstream/part-1.txt");
        FileInputStream fis2 = new FileInputStream("src/main/java/com/tpointtech/io/sequenceinputstream/part-2.txt");
        FileInputStream fis3 = new FileInputStream("src/main/java/com/tpointtech/io/sequenceinputstream/part-3.txt");
        BufferedInputStream bis = new BufferedInputStream(fis3);

        Vector<InputStream> vector = new Vector<>();
        vector.add(fis1);
        vector.add(fis2);
        vector.add(bis);

        return vector.elements();
    }
}
