package com.tpointtech.io.fileiostream.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDescriptorDemo {
    static void main() throws IOException {
        String filePath = "src/main/java/com/tpointtech/io/fileinputstream/file.txt";


        try (FileInputStream fis = new FileInputStream(filePath)) {

            // System.out.println(new String(fis.readAllBytes()));

            try (FileInputStream fis2 = new FileInputStream(fis.getFD())) {
                byte[] bytes = fis2.readAllBytes();
                System.out.println(bytes.length);
                System.out.println(new String(bytes));
            }

        }

    }
}
