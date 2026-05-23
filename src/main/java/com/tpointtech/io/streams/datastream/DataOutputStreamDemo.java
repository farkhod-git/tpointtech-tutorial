package com.tpointtech.io.streams.datastream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
    static void main() throws IOException {
        // Data output stream class in Java is used to write primitive data types
        //      to an output stream in a machine-independent format


        try (FileOutputStream fos = new FileOutputStream("src/main/java/com/tpointtech/io/datastream/data.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeFloat(12.3f);
            dos.writeBoolean(true);
            dos.writeInt(66);
            dos.writeChars("Hello World!");
            dos.writeUTF("This is a string");
        }

    }
}
