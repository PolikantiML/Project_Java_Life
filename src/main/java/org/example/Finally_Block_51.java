package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally_Block_51 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Program completed");
            }
        }
    }
}