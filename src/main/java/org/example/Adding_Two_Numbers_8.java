package org.example;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Adding_Two_Numbers_8 {
    public static void main(String[] args) {
        int x,y ;
        Scanner s =  new Scanner(System.in);
        System.out.print("Input X Value : ");
        x = s.nextInt();
        System.out.print("Input Y Value : ");
        y = s.nextInt();
        System.out.println("The Added value is : " + AddingNumbers(x,y));
    }

    static int AddingNumbers(int x, int y){
        return x+y;
    }
}