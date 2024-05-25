package org.example;

import java.util.Scanner;

public class Find_The_Largest_Number_9_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers that you want to enter :- ");
        int n = s.nextInt();
        System.out.println("So you are entering "+n+" numbers Hmmmm..............");
        int largest = Integer.MIN_VALUE;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
            if (array[i]>largest){
                largest = array[i] ;
            }
        }

        System.out.println("The Largest number in your inputs are : "+ largest);
        System.out.print("The array is : ");
        for (int itr:array) {
            System.out.print(itr+ " , ");
        }

    }
}