package org.example;

public class Join_Thread_69 extends Thread{
    public void run() {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) throws InterruptedException {

        int i = 10;

        Thread_Creation_68 obj1 = new Thread_Creation_68();
        Thread_Creation_68 obj2 = new Thread_Creation_68();
        Thread_Creation_68 obj3 = new Thread_Creation_68();
        Thread_Creation_68 obj4 = new Thread_Creation_68();
        Thread_Creation_68 obj5 = new Thread_Creation_68();
        obj1.start();
        obj1.join();
        obj2.start();
        obj2.join();
        obj3.start();
        obj3.join();
        obj4.start();
        obj4.join();
        obj5.start();
        obj5.join();
    }
}