package com.tpointtech.oopmisc;

public class Coupling {
    public static void main(String[] args) {
        tightCoupling();

        // Loose coupling

        interface Keyboard {
            void write();
        }

        class Laptop {
            private Keyboard keyboard;

            Laptop(Keyboard keyboard) {
                this.keyboard = keyboard;
            }

            public void setKeyboard(Keyboard keyboard) {
                this.keyboard = keyboard;
            }

            void enterPassword() {
                keyboard.write();
                System.out.println("Password is entering...");
            }
        }

        class KeyboardA implements Keyboard {
            @Override
            public void write() {
                System.out.println("First keyboard is writing...");
            }
        }

        class KeyboardB implements Keyboard {
            @Override
            public void write() {
                System.out.println("Second keyboard is writing");
            }
        }

        Laptop laptop = new Laptop(new KeyboardA());
        laptop.enterPassword();

        laptop.setKeyboard(new KeyboardB());
        laptop.enterPassword();

    }

    private static void tightCoupling() {
        class Keyboard {
            String name;
            double price;

            void write() {
                System.out.println("Keyboard is writing");
            }
        }

        class Laptop {
            // Tight coupling
            private final Keyboard keyboard = new Keyboard();

            void enterCode() {
                keyboard.write();
                System.out.println("Code is entering");
            }
        }
    }
}
