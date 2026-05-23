package com.tpointtech.io.writersandreaders;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileReaderDemo {
    static void main() throws IOException {

        String file = "src/main/java/com/tpointtech/io/writersandreaders/filewriter.txt";
        try (FileReader fr = new FileReader(file)) {
            List<String> lines = fr.readAllLines();
            for(String line : lines){
                System.out.println(line);
            }

            System.out.println("---");
            // this returns empty string because of file stream used above
            System.out.println(fr.readAllAsString());


        }
        
    }
}
