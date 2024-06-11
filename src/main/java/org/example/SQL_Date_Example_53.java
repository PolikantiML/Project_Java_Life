package org.example;

import java.sql.Date;

public class SQL_Date_Example_53 {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        long millis1 =System.nanoTime();
        Date date=new Date(millis);
        System.out.println(date);
        System.out.println(millis1);
    }
}