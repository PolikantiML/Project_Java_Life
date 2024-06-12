package org.example;

import java.util.Arrays;
import java.util.Random;

public class Linear_Search_Programme_60 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random ran = new Random();
        int length = arr.length ;
        for (int i = 0; i < length; i++) {
            arr[i] = ran.nextInt(10,80);
        }
        System.out.print("Elements in the array are : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        Arrays.sort(arr);
        System.out.print("Elements in the array are : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}