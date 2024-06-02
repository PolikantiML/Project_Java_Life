package org.example;

public class Static_Instance_Meathod_Diffarence_45 {
    public static void main(String[] args) {
        display(); //calling without object
        Static_Instance_Meathod_Diffarence_45 t = new Static_Instance_Meathod_Diffarence_45();
        t.show(); //calling using object
    }
    static void display() {
        System.out.println("Programming is amazing.");
    }
    void show(){
        System.out.println("Java is awesome.");
    }

}