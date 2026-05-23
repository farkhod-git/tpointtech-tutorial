package com.tpointtech.io.filterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStreamDemo {
    static void main() throws IOException {

        String basePath = "src/main/java/com/tpointtech/io/filterstream";
        String filePath = basePath + "/filter.txt";

        try (FileInputStream fis = new FileInputStream(filePath);
             FilterInputStream filterIS = new BufferedInputStream(fis)) {

            byte[] bytes = filterIS.readAllBytes();
            System.out.println(new String(bytes));
        }

    }
}
