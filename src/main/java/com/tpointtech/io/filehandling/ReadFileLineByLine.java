package com.tpointtech.io.filehandling;

import java.io.*;
import java.util.Scanner;

public class ReadFileLineByLine {
    static void main() {
        //1. Using BufferedReader Class

        File file = new File("src/main/java/com/tpointtech/filehandling/read/reading.txt");

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n === \n");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
