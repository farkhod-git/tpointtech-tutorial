package com.tpointtech.networking.url;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLClassDemo {
    public URLClassDemo() {
    }

    static void main() throws IOException {
        // URL - Uniform Resource Locator
        URL url = new URL("https://www.tpointtech.com/java-tutorial?search=something&size=11");
        urlShow(url);

        URLConnection urlConnection = new URL("https://www.tpointtech.com/java-tutorial").openConnection();
        urlConnection.connect();

        System.out.println("urlConnection.getContent() = " + new String(urlConnection.getInputStream().readAllBytes()));


    }

    private static void urlShow(URL url) throws IOException {
        System.out.println("url.getProtocol() = " + url.getProtocol());
        System.out.println("url.getHost() = " + url.getHost());
        System.out.println("url.getPort() = " + url.getPort());
        System.out.println("url.getFile() = " + url.getFile());
        System.out.println(url.getPath());
        System.out.println("url.getQuery() = " + url.getQuery());
        System.out.println("url.getRef() = " + url.getRef());
        System.out.println("url.getDefaultPort() = " + url.getDefaultPort());

        System.out.println("url.getContent() = " + url.getContent());
    }
}
