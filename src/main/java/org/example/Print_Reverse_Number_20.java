package org.example;

import java.util.Scanner;

public class Print_Reverse_Number_20 {
    public static void main(String[] args) {
        System.out.print("Enter your number that you are intended to reverse : ");
        int number = (new Scanner(System.in)).nextInt();
        int reverse=0 ;

        System.out.println("Reversing your number .....");

        while(number!=0) {
            reverse = reverse*10;
            reverse = reverse + number % 10;
            number  = number / 10;
        }

        System.out.println(reverse);
    }
}