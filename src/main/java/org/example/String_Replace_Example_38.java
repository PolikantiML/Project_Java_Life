package org.example;

public class String_Replace_Example_38 {
    public static void main(String args[]) {
        String s1 = "My name is Goutham. My name is Krishna. My name is Goutham Krishna.";
        String replaceString = s1.replaceAll("is", "was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }
}