//Here we are dealing with the fahrenheit vs celsius values
//The formula is °C = (°F - 32) × 5/9
package org.example;

import java.util.Scanner;

public class Fahrenheit_To_Celsius_5 {
    public static void main(String[] args) {
        float fahrenheit , celsius ;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the Fahrenheit Value : ");
        fahrenheit = s.nextFloat();
        System.out.println("Given Fahrenheit Value is : "+fahrenheit);
        celsius = (fahrenheit-32)*((float) 5/9);
        System.out.println("The Celsious value would be : "+celsius);

    }
}