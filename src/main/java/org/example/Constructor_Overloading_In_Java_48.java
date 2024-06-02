package org.example;

public class Constructor_Overloading_In_Java_48 {
    String name;
    Constructor_Overloading_In_Java_48() {
        System.out.println("Constructor method called.");
    }
    Constructor_Overloading_In_Java_48(String t) {
        name = t;
    }
    public static void main(String[] args) {
        Constructor_Overloading_In_Java_48 cpp = new Constructor_Overloading_In_Java_48();
        Constructor_Overloading_In_Java_48 java = new Constructor_Overloading_In_Java_48("Java");
        cpp.setName("C++");
        java.getName();
        cpp.getName();
    }
    void setName(String t) {
        name = t;
    }
    void getName() {
        System.out.println("Language name: " + name);
    }

}