package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_67 {
    public static void main(String args[]){
//1st way
        Pattern p = Pattern.compile("\bGout");//. represents single character
        Matcher m = p.matcher("Happy Birthday Goutham");
        boolean b = m.matches();
//2nd way
        boolean b2=Pattern.compile("^Gout").matcher("Happy Birthday Goutham").matches();
//3rd way
        boolean b3 = Pattern.matches("^Gout", "Happy Birthday Goutham");
        System.out.println(b+" "+b2+" "+b3);
    }
}