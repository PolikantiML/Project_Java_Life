//pattern that prints 8
package org.example;

import java.util.Scanner;

public class Star_Pattern_18_10 {
    public static void main(String[] args) {
        System.out.print("Enter the size of the pattern: ");
        int x = (new Scanner(System.in)).nextInt();

        // Adjusting for correct aspect ratio
        int height = 2 * x;  // Since 8 is essentially two loops, height is twice the width

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= x; j++) {
                // Conditions to print the stars in the pattern of 8
                if (i == 1 || i == height || i == x || j == 1 || j == x ||
                        (i < x && j == 1) || (i < x && j == x) || // Upper loop sides
                        (i > x && j == 1) || (i > x && j == x)) { // Lower loop sides
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}