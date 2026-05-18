package com.tpointtech.io.fileiostream.fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileOutputStreamDemo {
    static void main() throws IOException {
        // FileOutputStream class is used to write byte data to a file
        String fileName = "src/main/java/com/tpointtech/io/fileoutputstream/file.txt";
        try (FileOutputStream fos = new FileOutputStream(fileName)){
            fos.write("First row overwritten".getBytes());
        }

        // append true added data at the end of the file
        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
            fos.write("\nSecond row added end of text".getBytes());
        }

        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            fos.write("\nThird row added end of text\n".getBytes());

            // w added end of
            fos.write("\nFourth row added end of text".getBytes(), 10, 14);

            FileChannel channel = fos.getChannel();
            System.out.println(channel.size());

        }



    }
}
