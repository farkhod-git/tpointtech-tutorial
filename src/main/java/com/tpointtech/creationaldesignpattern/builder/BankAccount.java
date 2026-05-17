package com.tpointtech.creationaldesignpattern.builder;

public class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;
    private String email;
    private boolean newsletter;

    public static BankAccountBuilder builder(String name, String accountNumber) {
        return new BankAccountBuilder(name, accountNumber);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", email='" + email + '\'' +
                ", newsletter=" + newsletter +
                '}';
    }

    public static class BankAccountBuilder {
        private final String name;
        private final String accountNumber;
        private double balance;
        private String email;
        private boolean newsletter;

        // necessary values
        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder email(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder newsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            BankAccount bankAccount = new BankAccount();
            bankAccount.name = name;
            bankAccount.accountNumber = accountNumber;
            bankAccount.balance = balance;
            bankAccount.email = email;
            bankAccount.newsletter = newsletter;
            return bankAccount;
        }
    }
}
