package com.tpointtech.serialization.transientkeyword;

import java.io.*;

public class TransientDemo {
    static void main() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        User user = new User();
        oos.writeObject(user);

        String s = bos.toString();
        System.out.println(s);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        User u = (User) ois.readObject();
        System.out.println(u);
    }
}
