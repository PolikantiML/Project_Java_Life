package org.example;

public class Static_Block_In_Java_44 {
    public static void main(String[] args) {
        System.out.println("Static block will execute before the main method .....");
    }

    static {
        System.out.println("This will execute first");
        String os = System.getenv("OS");
        System.out.println(os);
        if (os.equals("Windows_NT") != true) {
            System.exit(1);
        }
    }
}