package org.example;

public class Java_Constructor_Example_42 {
    Java_Constructor_Example_42(){
        System.out.println("Printing Java_Constructor_Example_42.... means that constructor is called");
    }

    static void staticMethod(){
        System.out.println("Static method can be called without creating object");
    }

    void nonStaticMethod() {
        System.out.println("Non static method must be called by creating an object");
    }

    public static void main(String[] args) {
        staticMethod();
        Java_Constructor_Example_42 obj = new Java_Constructor_Example_42();
        obj.nonStaticMethod();
    }
}