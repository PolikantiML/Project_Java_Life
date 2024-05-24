//We are trying to find the larges number in the N number of items

package org.example;

import java.util.Scanner;

public class Find_The_Largest_Number_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}