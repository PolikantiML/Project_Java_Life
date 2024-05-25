package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_14 {
    public static void main(String[] args) {
        System.out.println("Input the factorial number ...: ");
        int n = (new Scanner(System.in)).nextInt();
        System.out.println(fact(n));
    }

    static BigInteger fact(int a){
        if (a==1) return BigInteger.ONE;
        else {
            return BigInteger.valueOf(a).multiply(fact(a-1));
        }
    }
}