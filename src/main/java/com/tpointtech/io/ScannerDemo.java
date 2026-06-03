package com.tpointtech.io;

import java.io.PrintStream;
import java.io.StringReader;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println(System.in);

//        System.out;

        PrintStream ps = new PrintStream(System.out);
        ps.print("Hello World");


        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());


        StringReader sr = new StringReader("Hello World\nLine1\n1 2 3 4");
        Scanner sc = new Scanner(sr);
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        if (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

        StringReader sr1 = new StringReader("Hello World\nLine1\n1 2 3 4");
        Scanner sc1 = new Scanner(sr1);
        if (sc1.hasNext()) {
            System.out.println(sc1.next());
        }

        Scanner sc2 = new Scanner("Next line a b c");
        System.out.println(sc2.nextLine());


    }
}
