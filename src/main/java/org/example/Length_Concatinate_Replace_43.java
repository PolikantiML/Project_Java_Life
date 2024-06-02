package org.example;

public class Length_Concatinate_Replace_43 {
    public static void main(String[] args) {
        String s1 = "Happy Programming , I Guess now you are practicing more programmes in Java Programming launguage";
        String s2 = " Now you should also try and focus upon Python launguage also";
        System.out.println(s1.length());
        System.out.println(s1.concat(s2));
        System.out.println(s1.replace("in","#in#"));
    }
}