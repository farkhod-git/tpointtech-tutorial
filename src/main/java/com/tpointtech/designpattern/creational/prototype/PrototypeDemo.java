package com.tpointtech.designpattern.creational.prototype;

public class PrototypeDemo {
    static void main() {
        User user = new User("John", "1234567890");

        User copy = user.copy();
        System.out.println(copy);

        User prototype = User.prototype(user);
        System.out.println(prototype);
    }
}
