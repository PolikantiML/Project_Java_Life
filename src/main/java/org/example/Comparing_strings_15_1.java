package org.example;

import java.util.Scanner;

public class Comparing_strings_15_1 {
    public static void main(String[] args) {
        System.out.println("Enter the String 1:  ");
        String str1 = (new Scanner(System.in)).next();
        String str2 = "";

        System.out.println("Reversing them ...");
        for (int i = str1.length()-1; i >= 0  ; i--) {
            str2 += (str1.toCharArray())[i];
        }
        System.out.println(str2);

        String str3 = new StringBuilder(str1).reverse().toString();

        System.out.println(str3);

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Polindrome");
        }
        else {
            System.out.println("Not Polindrome");
        }

    }
}