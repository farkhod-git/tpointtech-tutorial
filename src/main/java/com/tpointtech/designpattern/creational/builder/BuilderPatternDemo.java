package com.tpointtech.designpattern.creational.builder;

public class BuilderPatternDemo {
    static void main() {
        BankAccount bankAccount = BankAccount.builder("John", "1234567890")
                .balance(100.0)
                .email("john@gmail.com")
                .newsletter(true)
                .build();

        System.out.println(bankAccount);
    }
}
