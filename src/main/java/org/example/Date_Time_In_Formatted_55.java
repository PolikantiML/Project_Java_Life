package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Date_Time_In_Formatted_55 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy MM dd hh mm ss.SSS zzzz");
        String dateFormatted = formatter.format(date);
        System.out.println(dateFormatted);

        //doing the same thing using DateTimeFormatter , LocalDateTime

        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy MM dd hh mm ss.SSS");

        String dateFormatted1 = date1.format(formatter1);

        System.out.println(dateFormatted1);

        //but in the second method you may not get the zone


    }
}