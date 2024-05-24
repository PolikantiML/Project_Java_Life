package org.example;

import java.util.Scanner;

public class Swap_Two_Numbers_Without_Third_7 {
    public static void main(String[] args) {
        int x , y ;
        Scanner s =  new Scanner(System.in);
        System.out.print("Input X Value : ");
        x = s.nextInt();
        System.out.print("Input Y Value : ");
        y = s.nextInt();
        System.out.println("Please wait swapping two numbers now ......!");
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x and y values after swapping is : "+ x +" and "+ y +" Hence Swapped ....");

    }
}