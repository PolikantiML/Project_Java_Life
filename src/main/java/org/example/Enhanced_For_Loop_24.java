package org.example;

public class Enhanced_For_Loop_24 {
    public static void main(String[] args) {
        int[] a = {2,3,2,5,3,6,4,7,8,56,4,6,4,2};
        char[] b = {'a','b','c','d','e','f'};

        for (int i :
                a) {
            System.out.println(i);
        }

        for (char j :
                b) {
            System.out.println(j);
        }
    }
}