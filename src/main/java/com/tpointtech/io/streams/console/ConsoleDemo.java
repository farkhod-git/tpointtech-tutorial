package com.tpointtech.io.streams.console;

import java.io.Console;

public class ConsoleDemo {
    static void main() {

        // Java 1.5
        // Console class is used to read text input and passwords securely from user

        Console console = System.console();
        if (console == null) {
            System.err.println("Console only works from terminal!");
            return;
        }
        System.out.println(console);

        System.out.println("Enter your name");
        String name = console.readLine();

        console.printf("console.isTerminal() = %s", console.isTerminal());

        System.out.println("Enter your password");
        char[] chars = console.readPassword();

        System.out.println("Your name is " + name);
        System.out.println("Your password is " + new String(chars));

    }
}
