package com.tpointtech.networking.concepts;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSide {
    static void main() {
        try (Socket socket = new Socket("localhost", 8080)) {

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeBytes("""
                    METHOD - POST
                    API - /users/create
                    BODY - {"name":"Alisher"}""");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
