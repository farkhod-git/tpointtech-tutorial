package com.tpointtech.io.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Date;

public class FileHandlingInJava {
    static void main() throws IOException {
        try {
            canReadTest();
        } catch (IOException _) {
        }

        System.out.println("\n === \n");

        File file = new File("src/main/java/com/tpointtech/filehandling/new-file.txt");
        boolean newFile = file.createNewFile();
        if (newFile) {
            System.out.println("File created");
        }
//
        System.out.println("file.canWrite() = " + file.canWrite());
        System.out.println("file.exists() = " + file.exists());
//
        // boolean delete.txt = file.delete.txt();
        // if (delete.txt) {
           //  System.out.println("File deleted");
        // }

        System.out.println("file.getName() = " + file.getName());

        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath()); // /Users/...
        System.out.println("file.getPath() = " + file.getPath()); // src/...

        System.out.println("file.length() = " + file.length());
        System.out.println("file.list() = " + Arrays.toString(new File("src/main/java/com/tpointtech").list()));

        boolean mkdir = new File("src/main/java/com/tpointtech/filehandling/folder1").mkdir();
        boolean mkdir2 = new File("src/main/java/com/tpointtech/filehandling/folder1/folder2/folder3").mkdirs();
        System.out.println("mkdir = " + mkdir);
        System.out.println("mkdir2 = " + mkdir2);

        System.out.println("new Date(file.lastModified()) = " + new Date(file.lastModified()));

        boolean exists = file.renameTo(new File("src/main/java/com/tpointtech/filehandling/new-file2.txt"));
        System.out.println("exists = " + exists);

    }

    private static void canReadTest() throws IOException {
        File file = new File("/Users/farkhod/IdeaProjects/secret.txt");
        boolean setReadable = file.setReadable(true, true);
        System.out.println("setReadable = " + setReadable);
        System.out.println("file.length() = " + file.length());


        System.out.println("file.canRead() = " + file.canRead());
        System.out.println("file.canWrite() = " + file.canWrite());

        File dir = new File("/Users/farkhod/IdeaProjects/secret");
        System.out.println("dir.canRead() = " + dir.canRead());
        System.out.println("dir.canWrite() = " + dir.canWrite());

        File dirFile = new File("/Users/farkhod/IdeaProjects/secret/file.txt");
        System.out.println("dirFile.canRead() = " + dirFile.canRead());
        System.out.println("dirFile.canWrite() = " + dirFile.canWrite());
        System.out.println("dirFile.exists() = " + dirFile.exists());

//        byte[] dirFileBytes = Files.readAllBytes(dirFile.toPath());
//        System.out.println(Arrays.toString(dirFileBytes));


        byte[] bytes = Files.readAllBytes(Path.of(file.getPath()));
        System.out.println(Arrays.toString(bytes));
    }
}
