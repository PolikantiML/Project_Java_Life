package org.example;

import java.util.Scanner;

public class Input_Using_Scanner_4 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Input an Integer : ");
        System.out.println("Given integer as input is: "+ s.nextInt());
        System.out.print("Input an Integer : ");
        System.out.println("Given String as input is: "+ s.next());

    }
}