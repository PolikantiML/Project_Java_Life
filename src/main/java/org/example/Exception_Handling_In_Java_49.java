package org.example;

public class Exception_Handling_In_Java_49 {
    public static void main(String[] args) {
        int a=0,b=0,result;

        try{
            result=a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Exception is Divisible by zero");

        }
    }
}