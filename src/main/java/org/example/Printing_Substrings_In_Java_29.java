package org.example;

import java.util.Scanner;

public class Printing_Substrings_In_Java_29 {
    public static void main(String[] args) {
        System.out.println("Write the paragraph below :- ");
        String s = (new Scanner(System.in)).nextLine();
        System.out.println("Finding Substrings below :- ");

        // Split the string into words using space as a delimiter
        String[] words = s.split(" ");

        // Print each word
        for (String word : words) {
            System.out.println(word);
        }
    }
}