package org.example;

import java.util.Scanner;

public class Star_Pattern_18_2 {
    public static void main(String[] args) {
        System.out.print("How many lines do you want .....");
        int x = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) System.out.print("");
            System.out.println(" *");
        }
    }
}