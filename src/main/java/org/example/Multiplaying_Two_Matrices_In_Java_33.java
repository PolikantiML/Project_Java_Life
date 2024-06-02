package org.example;

import java.util.Scanner;

public class Multiplaying_Two_Matrices_In_Java_33 {
    public static void main(String[] args) {
        System.out.println("Matrix Multiplication Programme...");
        System.out.println("Enter the Dimensions of the Matrices that you wish to add ....");

        System.out.println("Matrix 1 Dimensions ");
        System.out.print("Length 1... : ");
        int length1 = (new Scanner(System.in)).nextInt();
        System.out.print("Breath 1... : ");
        int breath1 = (new Scanner(System.in)).nextInt();

        System.out.println("Matrix 2 Dimensions ");
        System.out.print("Length 2... : ");
        int length2 = (new Scanner(System.in)).nextInt();
        System.out.print("Breath 2... : ");
        int breath2 = (new Scanner(System.in)).nextInt();

        if (breath1 == length2){
            System.out.println("the number of columns in the first matrix is equal to the number of rows in the second matrix....");
        }else {
            System.out.println("For matrix multiplication, the number of columns in the first matrix must be equal to the number of rows in the second matrix ...");
            System.exit(0);
        }

        int[][] matrix1 = new int[length1][breath1];
        int[][] matrix2 = new int[length2][breath2];
        int[][] multiplication = new int[length1][breath1];

        System.out.println("Enter Matrix 1 values ..");
        for (int i = 0; i <= length1-1 ; i++) {
            System.out.println("Enter Row "+i+" values");
            for (int j = 0; j <= breath1-1 ; j++) {
                matrix1[i][j] = (new Scanner(System.in)).nextInt();
            }
        }
        System.out.println("===================================");
        for (int i = 0; i <= length1-1 ; i++) {
            for (int j = 0; j <= breath1-1; j++) {
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("===================================");


        System.out.println("Enter Matrix 2 values ..");
        for (int i = 0; i <= length1-1 ; i++) {
            System.out.println("Enter Row "+i+" values");
            for (int j = 0; j <= breath1-1 ; j++) {
                matrix2[i][j] = (new Scanner(System.in)).nextInt();
            }
        }

        System.out.println("===================================");
        for (int i = 0; i <= length2-1 ; i++) {
            for (int j = 0; j <= breath2-1; j++) {
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("===================================");


        for (int i = 0; i <= length1-1 ; i++) {
            for (int j = 0; j <= breath2-1; j++) {
                multiplication[i][j]=0;
                for (int k = 0; k < breath1; k++) {
                    multiplication[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("Multiplication of both the matrices are ...");
        System.out.println("===================================");
        for (int i = 0; i <= length2-1 ; i++) {
            for (int j = 0; j <= breath2-1; j++) {
                System.out.print(multiplication[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("===================================");


    }
}