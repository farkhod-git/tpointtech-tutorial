package com.tpointtech.designpattern.creational.prototype;

public class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User copy() {
        return new User(this.name, this.email);
    }

    public static User prototype(User other) {
        return new User(other.name, other.email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
