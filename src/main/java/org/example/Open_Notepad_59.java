package org.example;

import java.io.IOException;

public class Open_Notepad_59 {
    public static void main(String[] args) throws IOException {
        try{
            Runtime runtime = Runtime.getRuntime();
            System.out.println(runtime.exec("notepad"));
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}