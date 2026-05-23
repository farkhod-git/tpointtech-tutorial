package com.tpointtech.io.streams.filterstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamDemo {
    static void main() throws IOException {
        // FilterOutputStream is wrapper output stream
        //  and used to filter or modify the data written to another output stream

        String basePath = "src/main/java/com/tpointtech/io/filterstream";
        String filePath = basePath + "/filter.txt";

        File file = new File(filePath);

        try (FileOutputStream fos = new FileOutputStream(file);
             FilterOutputStream filterOS = new FilterOutputStream(fos);) {


            String data = "Hello Data! 😐";
            filterOS.write(data.getBytes());

            fos.write("ABCD".getBytes());

        }

        // FilterOutputStream class is parent of BufferedOutputStream, DataOutputStream and others
        // FilterInputStream class is parent of BufferedInputStream, DataInputStream and others

    }
}
