package org.example;

import java.util.Scanner;

public class Nested_If_Else_Example_12 {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        char grade;
        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) {
            if (marksObtained > 100 ) {
                System.out.println("Your marks are not practical");return;
            }
            else if (marksObtained > 90 && marksObtained<100)
                grade = 'A';
            else if (marksObtained > 75 && marksObtained<100)
                grade = 'B';
            else if (marksObtained > 60 && marksObtained<100)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("You passed the exam and your grade is " + grade);
        }
        else {
            grade = 'F';
            System.out.println("You failed and your grade is " + grade);
        }
    }


}