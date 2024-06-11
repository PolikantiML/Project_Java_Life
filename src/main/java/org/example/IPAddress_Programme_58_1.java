package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress_Programme_58_1 {
    public static void main(String[] args) throws UnknownHostException {
        try {
            InetAddress net = InetAddress.getLocalHost();


            System.out.println(net.getHostAddress());
            System.out.println(net.getHostName());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}