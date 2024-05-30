package org.example;

import java.util.Scanner;

public class Floyds_Triangle_28 {
    public static void main(String[] args) {
        System.out.print("Enter The Number of rows required for Floys's Triangle:-  ");
        int number = (new Scanner(System.in)).nextInt();
        int counter = 0;
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <=i ; j++) {
                counter+=1;
                System.out.print(counter+"   ");
            }
            System.out.println("   ");
        }
       // System.out.println(Math.pow(counter,3));
    }
}