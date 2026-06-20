package com.tpointtech.filehandling;

import java.io.File;

public class FileDemo {
    static void main() {
        // File class is used to work with files and directories

        File file = new File("src/main/java/com/tpointtech/filehandling/new-file2.txt");
        System.out.println("file.toURI() = " + file.toURI());

        String pathSeparator = File.pathSeparator;
        System.out.println("File.pathSeparator = " + pathSeparator);
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println("pathSeparator = " + pathSeparatorChar);
        System.out.println("File.separator = " + File.separator);


    }
}
