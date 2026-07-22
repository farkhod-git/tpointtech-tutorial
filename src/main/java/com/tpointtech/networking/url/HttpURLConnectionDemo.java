package com.tpointtech.networking.url;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {
    static void main() throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.connect();
        System.out.println("httpURLConnection.getResponseCode() = " + httpURLConnection.getResponseCode());

        System.out.println("new String(httpURLConnection.getInputStream().readAllBytes()) = " + new String(httpURLConnection.getInputStream().readAllBytes()));

        System.out.println("httpURLConnection.getHeaderFields() = " + httpURLConnection.getHeaderFields());

        httpURLConnection.disconnect();

    }
}
