package org.example;

import java.util.Scanner;

public class Polindrome_Or_Not_Programme_31 {
    public static void main(String[] args) {
        System.out.println("Enter a String to find out Polindrome...");
        String str = (new Scanner(System.in)).next();
        int length = str.length();
        String rev = "";
        for (int i = length-1; i >=0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Before reversing : "+str);
        System.out.println("After reversing  : "+rev);

        if (str.equalsIgnoreCase(rev)){
            System.out.println("Polindrome..");
        }else {
            System.out.println("Not Polindrome..");
        }
    }
}