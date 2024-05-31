package org.example;

import java.util.Scanner;

public class Reverse_A_String_30_1 {
    public static void main(String[] args) {
        System.out.println("Enter the String input");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        System.out.println(st);
        System.out.println("============================");
        System.out.println("        Reversing           ");
        System.out.println("============================");

        int length = st.length();
        String reverse="";

        for (int i = length-1; i >= 0 ; i--) {
            reverse += st.charAt(i);
        }

        System.out.println(reverse);
    }
}