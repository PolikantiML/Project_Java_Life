package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest {

    AppTest(){
      //  a = 0;
        b=0;
        c=0;
        d=0;
    }
    static int b ;
    int c;
    final int d;
    public static void main(String[] args) {
        int a=0;
        AppTest app = new AppTest();
        System.out.println(a);
        System.out.println(AppTest.b);
        System.out.println(app.c);
        System.out.println(app.d);
    }
}