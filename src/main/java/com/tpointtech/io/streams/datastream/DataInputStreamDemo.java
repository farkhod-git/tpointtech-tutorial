package com.tpointtech.io.streams.datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
    static void main() throws IOException {

        String filePath = "src/main/java/com/tpointtech/io/datastream/data.txt";
        try (FileInputStream fis = new FileInputStream(filePath);
             DataInputStream dis = new DataInputStream(fis)) {

            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());

            for (int i = 0; i < 12; i++) {
                System.out.print(dis.readChar());
            }
            System.out.println();
            System.out.println(dis.readUTF());

            System.out.println(dis.available());
            System.out.println(dis.read());
        }


    }
}
