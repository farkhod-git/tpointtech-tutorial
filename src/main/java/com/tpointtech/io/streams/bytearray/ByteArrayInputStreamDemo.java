package com.tpointtech.io.streams.bytearray;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayInputStreamDemo {
    static void main() throws IOException {
        // Byte array input stream reads data directly from a byte array stored in memory
        //      instead of reading data from a file


        byte[] bs = {35, 36, 37, 38};
        try (ByteArrayInputStream is = new ByteArrayInputStream(bs)) {
            byte[] bytes = is.readAllBytes();
            System.out.println(new String(bytes));
            System.out.println(Arrays.toString(bytes));
        }

    }
}
