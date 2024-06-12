//In this programme we are implementing prime number programme logic

package org.example;

import java.util.Scanner;

public class Printing_Prime_Number_26 {
    public static void main(String[] args) {
        System.out.print("Printing prime number series ... Untill which range you need me to print the numbers :- ");
        int number = (new Scanner(System.in)).nextInt();
        int flag = 0;
        if (number <= 1) {
            System.out.println("No prime Numbers");
        } else if (number > 1) {
            System.out.println("The Entered number is grater than zero .... so proceeding ");
            if (number == 2) {
                System.out.println(number + " is the only prime number");
            } else {
                for (int j = 2; j <= number; j++) {
                    flag = 1; // Initializing flag inside the loop
                    for (int i = 2; i <= Math.floor(Math.sqrt(j)); i++) {
                        if (j % i == 0) {
                            flag = 0;
                            break;
                        }
                    }
                    if (flag == 1) {
                        System.out.print(j + " ,");
                    }
                }
            }
        }
    }
}