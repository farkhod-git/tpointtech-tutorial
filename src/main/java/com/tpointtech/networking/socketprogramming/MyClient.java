package com.tpointtech.networking.socketprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    static void main() {

        try (Socket socket = new Socket("localhost", 6677)) {
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Write: ");
                String info = sc.nextLine();

                if (info.equals("END")) {
                    break;
                }

                dos.writeUTF(info);
                String answer = dis.readUTF();
                System.out.println("Answer: " + answer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
