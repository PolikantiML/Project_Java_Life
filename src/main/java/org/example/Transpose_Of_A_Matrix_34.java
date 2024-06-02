package org.example;

import java.util.Scanner;

public class Transpose_Of_A_Matrix_34 {
    public static void main(String[] args) {

        System.out.println("Matrix  Dimensions ");
        System.out.print("Length ... : ");
        int length1 = (new Scanner(System.in)).nextInt();
        System.out.print("Breath ... : ");
        int breath1 = (new Scanner(System.in)).nextInt();

        int[][] matrix1 = new int[length1][breath1];
        int transpose_length = breath1;
        int transpose_breath = length1;
        int[][] transpose = new int[transpose_length][transpose_breath];


        System.out.println("Enter Matrix  values ..");
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
        System.out.println(".........Transposing Matrics.......");
        System.out.println("===================================");
        for (int i = 0; i <= transpose_length-1 ; i++) {
            for (int j = 0; j <= transpose_breath-1; j++) {
                transpose[i][j]=matrix1[j][i];
            }
        }
        System.out.println("===================================");
        for (int i = 0; i <= transpose_length-1 ; i++) {
            for (int j = 0; j <= transpose_breath-1; j++) {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}