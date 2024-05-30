package org.example;

import java.util.Scanner;

public class Armstrong_Number_27 {
    public static void main(String[] args) {

        System.out.print("Enter the Number :- ");
        int number = (new Scanner(System.in)).nextInt();
        System.out.println("Processing for armstrong number ......");
        int temp , armstrong =0, reminder , cube;
        temp = number;

        while(temp!=0) {
            reminder = temp % 10;
            temp = temp/10;
            cube = reminder * reminder * reminder;
            armstrong += cube;
        }
        System.out.println("Given Number is :- "+number);
        System.out.println("Armstrong Number is:- "+armstrong);

        if (number==armstrong){
            System.out.println("The Given Number is Armstrong");
        }else {
            System.out.println("The Given number is not Armstrong");
        }
    }
}