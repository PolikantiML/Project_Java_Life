package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetOwnIPAddress_58 {
    public static void main(String[] args) {
        try {
            // Get the local host InetAddress object
            InetAddress inetAddress = InetAddress.getLocalHost();

            // Get the IP address as a string
            String ipAddress = inetAddress.getHostAddress();

            // Print the IP address
            System.out.println("IP Address: " + ipAddress);

            // Get the hostname
            String hostname = inetAddress.getHostName();

            // Print the hostname
            System.out.println("Hostname: " + hostname);

        } catch (UnknownHostException e) {
            // Handle exception if the local host name could not be resolved into an address
            System.out.println("Unable to determine IP address and hostname.");
            e.printStackTrace();
        }
    }
}