package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_Intextfile_70 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hi I am working to handle files concept");
        try {
            FileWriter file = new FileWriter("C:\\Users\\hp\\IdeaProjects\\Project_Java_Life\\Utilities\\samplefile.txt");
            file.append("Trying to enter the string values ");
            file.close();
            System.out.println(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}