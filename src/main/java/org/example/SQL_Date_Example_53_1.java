package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SQL_Date_Example_53_1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat dateFormatted = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS");
        String formattedDate = dateFormatted.format(date);
        System.out.println(formattedDate);

        //I am also using the calender class in java utill
//        Calender calender = (Calender) Calendar.getInstance();
//        System.out.println(calender.notify());
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date and Time: " + calendar.getTime());

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}

// Now I need to print it in a particular format