package com.tpointtech.collections.arraylist;

import java.io.*;
import java.util.ArrayList;

public class ArrayListSerializationAndDeserialization {
    static void main() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);

        // serialize(list);

        try (FileInputStream fis = new FileInputStream("src/main/java/com/tpointtech/collections/arraylist/arraylist.txt");
        ObjectInputStream ois = new ObjectInputStream(fis)) {
            @SuppressWarnings("unchecked")
            ArrayList<Integer> l = (ArrayList<Integer>) ois.readObject();
            System.out.println(l);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void serialize(ArrayList<Integer> list) {
        try (FileOutputStream fos = new FileOutputStream("src/main/java/com/tpointtech/collections/arraylist/arraylist.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
