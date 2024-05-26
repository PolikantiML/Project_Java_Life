package org.example;

import java.util.Scanner;

public class Star_Pattern_18_4 {
    public static void main(String[] args) {
        System.out.print("How many lines do you want .....");
        int x = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++)
            {
                if (j<=i-1){
                System.out.print(" ");}
                else System.out.print("*");
//                if (j>(x-i)){
//                    System.out.print("*");}
//                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}