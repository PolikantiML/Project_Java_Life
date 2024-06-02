package org.example;

import java.util.Scanner;
public class Adding_Two_Matrices_In_Java_32 {
    public static void main(String[] args) {
        System.out.println("Matrix Addition Programme...");
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

        if (length1*breath1 == length2*breath2){
            System.out.println("Both Matrices Have same dimensions so proceeding....");
        }else {
            System.out.println("As per rules, For Matrix Addition we need the dimensions of the both matrices should be same ...");
            System.exit(0);
        }

        int[][] matrix1 = new int[length1][breath1];
        int[][] matrix2 = new int[length2][breath2];
        int[][] sum     = new int[length1][breath1];

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


        for (int i = 0; i <= length2-1 ; i++) {
            for (int j = 0; j <= breath2 - 1; j++) {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of both the matrices are ...");
        System.out.println("===================================");
        for (int i = 0; i <= length2-1 ; i++) {
            for (int j = 0; j <= breath2-1; j++) {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("===================================");


    }
}