package com.tpointtech.io.filehandling;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DeleteFileDemo {
    static void main() {

        File file = new File("src/main/java/com/tpointtech/filehandling/tests/delete.txt");

        // this method deletes file when only the JVM terminates
        // After this method called once, the delete request cannot be canceled
        file.deleteOnExit();

//        boolean delete = file.delete();
//        if (delete) {
//            System.out.println("File deleted successfully");
//        }

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
