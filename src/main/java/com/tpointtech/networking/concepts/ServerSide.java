package com.tpointtech.networking.concepts;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    static void main() {
        // package - java.net.*

        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("Server started. Waiting for client...");

            Socket socket = server.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());


            String message;
            while (!(message = new String(dis.readAllBytes())).equals("END")) {
                System.out.println("Client: " + message);

                String[] split = message.split("\n");
                String[] api = split[1].split(" - ");
                if (api[1].equals("/users/create")) {
                    createUser(split[2].split(" - ")[1]);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void createUser(String user) {
        System.out.println("Creating user: " + user);
    }
}
