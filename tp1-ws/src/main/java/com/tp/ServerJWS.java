package com.tp;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8888/";
        Endpoint.publish(url, new BankAccountService());
        System.out.println("Server JWS has been published at " + url);
    }
}
