package org.example;

public class Multiple_Classes_In_A_File_46 {
    Multiple_Classes_In_A_File_46(){
        System.out.println("Constructor Multiple_Classes_In_A_File_46 instanciated");
    }

    void additionalMeathod(){
        System.out.println("Printing Additional Meathods from main class...");
    }

    public static void main(String[] args) {
        Multiple_Classes_In_A_File_46 ob1 = new Multiple_Classes_In_A_File_46();
        Additional ob2 = new Additional();
        ob1.additionalMeathod();
        ob2.additionalMeathod();
    }
}

class Additional {
    Additional(){
        System.out.println("Additional Constructor got instanciated");
    }

    void additionalMeathod(){
        System.out.println("Printing Additional Meathods...");
    }
}