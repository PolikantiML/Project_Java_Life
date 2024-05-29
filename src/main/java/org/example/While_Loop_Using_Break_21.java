package org.example;

import java.util.Scanner;

public class While_Loop_Using_Break_21 {
    public static void main(String[] args) {
        int number,lastNumber = 0, secondLastNumber = 0;
        Scanner s= new Scanner(System.in);

        while (true){
            System.out.print("Input an Integer ....");
            number = s.nextInt();
            //temp   = number;

            if (number==0){
                break;
            }
            secondLastNumber = lastNumber; // Update the second last number
            lastNumber = number;  // Update the last number
        }
        System.out.print("Your last but one entered number is :-"+secondLastNumber);
        System.out.print("Your last but one entered number is :-"+lastNumber);
    }
}