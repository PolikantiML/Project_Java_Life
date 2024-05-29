package org.example;

import java.util.Scanner;

public class Break_Continue_While_Loop_22 {
    public static void main(String[] args) {
        int number,lastNumber = 0, secondLastNumber = 0;
        Scanner s= new Scanner(System.in);

        while (true){
            System.out.print("Input an Integer ....");
            number = s.nextInt();

            if (number!=0){
                secondLastNumber = lastNumber;
                lastNumber = number;
                continue;
            }else {
                break;
            }

        }
        System.out.println("Your last but one entered number is :-"+secondLastNumber);
        System.out.print("Your last but one entered number is :-"+lastNumber);
    }
}