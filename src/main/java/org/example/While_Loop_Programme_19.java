package org.example;

import java.util.Scanner;

public class While_Loop_Programme_19 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        while ((n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Input an integer");
        }
        System.out.println("Out of loop");
    }

}