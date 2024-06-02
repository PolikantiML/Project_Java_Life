package org.example;

public class Throwing_An_Exception_50 {
    static void validate(int age){
       try {
           if (age < 18)
               throw new ArithmeticException("not valid");
           else
               System.out.println("welcome Goutham Krishna");
       }catch(ArithmeticException e){
           System.out.println("Exception Handled");
        }
    }
    public static void main(String args[]){
        validate(13);
        System.out.println("rest of the code...");
    }
}