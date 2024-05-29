package org.example;

import java.util.Scanner;

public class Printing_Multiplication_Table_25 {
    public static void main(String[] args) {
        System.out.print("Enter the table value : ");
        int number = (new Scanner(System.in)).nextInt();
        System.out.println("Printing the numbers table");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number +"*"+i +"="+ (number*i));
        }
    }
}