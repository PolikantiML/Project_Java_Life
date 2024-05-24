//Here we are swapping thw variable using the third value
package org.example;

import java.util.Scanner;

public class Swap_Two_Numbers_By_Using_Third_6 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s = new Scanner(System.in);
        System.out.print("Input X Value :");
        x = s.nextInt();
        System.out.print("Input Y Value : ");
        y = s.nextInt();
        System.out.println("Please wait swapping two numbers now ......!");
        z = x;
        x = y;
        y = z;
        System.out.println("x and y values after swapping is : "+ x +" and "+ y +" Hence Swapped ....");
    }
}