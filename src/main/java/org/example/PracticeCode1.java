package org.example;
import java.util.ArrayList;
public class PracticeCode1 {
    public static void main(String[] args) {
        Object[] actual = {1,2,'a','a','a'};
        ArrayList<Object> duplicate = new ArrayList<>();;

        for (int i = 0; i < actual.length; i++) {
            Boolean flag = false ;
            //System.out.println(i);
            for (int j = 0; j < actual.length; j++) {
                if(actual[i].equals(actual[j]) && (i!=j)) {
                    flag = true ;
                    break;
                }
            }
            if(flag){
                duplicate.add(actual[i]);
            }
        }

        System.out.println("Duplicate Values Are : "+duplicate);
    }
}