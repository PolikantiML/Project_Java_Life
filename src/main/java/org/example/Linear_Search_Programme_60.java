package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Linear_Search_Programme_60 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        Random ran = new Random();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = ran.nextInt(10, 80);
        }
        System.out.print("Elements in the array without sorting are : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        Arrays.sort(arr);

        System.out.print("Elements in the array in assending order are : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print("Elements in descending order: ");
        for (int j = 0; j < length; j++) {
            System.out.print(arr[j] + " ");

        }
        System.out.println("");
        System.out.print("Enter the element that you wish to find :-");
        int counter = 0;
        int element = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < length; i++) {
            if (element==arr[i]){
                counter++;
            }
        }
        if (counter!=0){
            System.out.println("The Element is there in the array");
        }
    }
}