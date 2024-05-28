package org.example;

import java.util.Scanner;

public class Star_Pattern_18_9 {
    static int y,z;
    public static void main(String[] args) {
        System.out.print("How many lines do you want .....");
        int x = ((new Scanner(System.in)).nextInt());

        if (x%2==0) {
            System.out.println("even");
            y=z=x/2;
        }
        else {
            System.out.println("odd");
            y=(x/2)+1;
            z=x/2;
        }
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y; j++)
            {
                if (j>(y-i)){
                    System.out.print("* ");}
                else System.out.print(" ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z; j++) {
                if (j<=(i-1))
                    System.out.print(" ");
                else {
                    if (x%2==0) {
                        System.out.print("* ");
                    }else System.out.print(" *");
                }
            }
            System.out.println("");
        }


    }
}