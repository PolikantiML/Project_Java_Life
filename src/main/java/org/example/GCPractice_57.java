package org.example;

public class GCPractice_57 {

    public void finalize(){
        int i = 0 ;i++;
        System.out.println("Called "+i + " times.");

    }
    public static void main(String[] args) {

        GCPractice_57 gc1 = new GCPractice_57();
        GCPractice_57 gc2 = new GCPractice_57();
        GCPractice_57 gc3 = new GCPractice_57();

        new GCPractice_57();//ananomous

        gc1 =null;//unreferred and unused
        gc2 = gc3;//unreferred and unused

        System.gc();

        Runtime rc=Runtime.getRuntime();
        System.out.println(rc.freeMemory());
        rc.gc();
        System.out.println(rc.freeMemory());

    }
}