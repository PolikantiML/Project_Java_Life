package org.example;

import java.util.Scanner;

public class Star_Pattern_18_1 {
    public static void main(String[] args) {
        System.out.print("How many lines do you want .....");
        int x = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = i; j <= x; j++) {
                System.out.print("* ");
            }
            System.out.println("_");
        }
    }
}