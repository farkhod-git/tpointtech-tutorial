package com.tpointtech.serialization;
// Serialization.
// Serialization is the process of converting an object's state into a byte-stream.
//
// This byte stream can be:
//      stored in a file
//      sent over a network
//      saved in a database

// Java provides the ObjectOutputStream class to perform serialization.
// writeObject() method is used to serialize an object

import java.io.*;

// To make an object eligible for serialization,
//      its class must implement the Serializable interface
public class SerializationAndDeserializationDemo {
    static void main() throws IOException, ClassNotFoundException {

        A a = new A();

        String name = "src/main/java/com/tpointtech/serialization/a.txt";
        try (FileOutputStream fos = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(a);
        }


        try (FileInputStream fis = new FileInputStream(name);
             ObjectInputStream ois = new ObjectInputStream(fis)){

            Object o = ois.readObject();
            A a2 = (A) o;
            System.out.println(a2);
        }


    }
}
