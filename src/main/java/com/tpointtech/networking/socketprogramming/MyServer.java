package com.tpointtech.networking.socketprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyServer {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    static void main() {

        try (ServerSocket server = new ServerSocket(6677)) {

            while (true) {
                try {
                    System.out.println("Waiting for connection...");
                    Socket socket = server.accept();
                    System.out.println("Connection established " + socket.getInetAddress().getHostName());

                    Scanner scanner = new Scanner(System.in);

//                    executor.execute(() -> {
                    try {
                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

                        String line;
                        while (!(line = dis.readUTF()).equals("END")) {
                            System.out.println(line);
                            System.out.print("Reply: ");
                            String s = scanner.nextLine();
                            dos.writeUTF(s);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
//                    });
                } catch (Exception _) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
