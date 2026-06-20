package com.tpointtech.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDemo {
    static void main() throws IOException {
        // 1 File.createNewFile()

        File file = new File("src/main/java/com/tpointtech/filehandling/info-a.txt");
        boolean created = file.createNewFile();
        System.out.println(created);

        File f1 = new File("src/main/java/com/tpointtech/filehandling/tests/info-a.txt");
        boolean mkdirs = f1.getParentFile().mkdirs();
        System.out.println(mkdirs);
        boolean created1 = f1.createNewFile();
        System.out.println(created1);

        // 2 FileOutputStream

        try (FileOutputStream os = new FileOutputStream("src/main/java/com/tpointtech/filehandling/tests/info-b.txt")) {
            os.write("ABC".getBytes());
        }

        // Files.createFile()
        Path path = Paths.get("src/main/java/com/tpointtech/filehandling/tests/info-c.txt");
        Files.createFile(path);

    }
}
