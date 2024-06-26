package org.example;

public class Thread_Creation_68 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        int i =10 ;

        Thread_Creation_68 obj = new Thread_Creation_68();
        obj.start();
    }
}