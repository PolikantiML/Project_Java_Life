package org.example;

import java.util.Scanner;

public class Comparing_Two_Strings_In_Java_15 {
    public static void main(String[] args) {
        System.out.print("Please Enter String 1 : ");
        String str1 = (new Scanner(System.in)).next();
        System.out.print("Please Enter String 2 : ");
        String str2 = (new Scanner(System.in)).next();

        if (str2.equalsIgnoreCase(str1)) System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");

        char[] rev = new char[5];
        char[] ori = str2.toCharArray();
        for (int i = str2.length()-1, j= 0; i >=0 ; i-- , j++) {
            rev[j] = ori[i];
        }
//        System.out.println(ori);
//        System.out.println(rev);
//        char[] ori = str2.toCharArray();
//        char[] rev = new char[5];
//        rev[0]=ori[4];
//        rev[1]=ori[3];
//        rev[2]=ori[2];
//        rev[3]=ori[1];
//        rev[4]=ori[0];
        System.out.println(ori);
        System.out.println(rev);
        Boolean flag = rev.toString().equalsIgnoreCase(str2);
        //Boolean flag1 = str2.equalsIgnoreCase(rev.toString();
        System.out.println(flag);
       // System.out.println(flag1);
        if (str2.equalsIgnoreCase(rev.toString())){
            System.out.println("Polindrome");
        }else System.out.println("Not Polindrome");

    }
}