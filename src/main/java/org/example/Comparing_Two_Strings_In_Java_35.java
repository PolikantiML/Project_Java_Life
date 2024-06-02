package org.example;

public class Comparing_Two_Strings_In_Java_35 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";
        //String s4 = "Hello";
        String s4="hello";
        String s5="hello";
        String s6="meklo";
        String s7="hemlo";
        System.out.println(s4.compareTo(s5));
        System.out.println(s4.compareTo(s6));
        System.out.println(s4.compareTo(s7));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
    }
}
//    Summary of Expected Output
//plaintext
//        Copy code
//        0
//        -5
//        -1
//        0
//        -32
//        0
//        Explanation for Differences
//        Lexicographical Comparison: The compareTo method compares strings lexicographically based on Unicode values of each character.
//        Case Sensitivity: compareToIgnoreCase ignores case differences, while compareTo does not.
//        Character-by-Character Comparison: The compareTo method checks each character from the beginning of the string until it finds a difference.
//        By understanding these methods and how they compare strings, you can predict the output of string comparisons in Java.