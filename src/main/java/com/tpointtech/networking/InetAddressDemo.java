package com.tpointtech.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    static void main() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("www.tpointtech.com");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
    }
}
