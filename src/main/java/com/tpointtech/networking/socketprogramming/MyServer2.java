package com.tpointtech.networking.socketprogramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyServer2 {
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(10);
    private static final List<Socket> SOCKETS = new ArrayList<>();

    static void main() {

        try (ServerSocket serverSocket = new ServerSocket(8888)) {

            // serverSocket.getChannel().

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
