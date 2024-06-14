package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Binary_Search_61 {
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

        System.out.print("Enter the element that you wish to find :-");
        int element = (new Scanner(System.in)).nextInt();
        System.out.print("Element is "+element);
        int low = 0;
        int high = length-1;
        int mid = (low+high)/2;

        while (low<=high){
            if (arr[mid]<element){
                low = mid-1;
            } else if (arr[mid]>element) {
                high = mid+1;
                mid = (low+high)/2;
            } else if (element==arr[mid]) {
                System.out.println("Element Found at "+mid+" index");
                break;
            }
        }
        if (low>high){
            System.out.println("Element Not Found. ");
        }
    }
}