package org.example;

import java.util.Scanner;

public class Star_Pattern_18_11 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines for the triangle: ");
        int x = (new Scanner(System.in)).nextInt();

        for (int i = 1; i <= x; i++) {
            // Print leading spaces
            for (int j = 1; j <= x - i; j++) {
                System.out.print("  ");
            }
            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == x) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}