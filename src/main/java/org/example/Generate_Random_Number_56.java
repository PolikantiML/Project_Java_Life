package org.example;

import java.util.Random;

import static java.lang.Math.random;

public class Generate_Random_Number_56 {
    public static void main(String[] args) {

        Random x = new Random();
        System.out.println(x.nextInt(100, 599));

        for (int i = 0; i <=10; i++) {
            System.out.println(x.nextInt(99,199));
        }
    }
}