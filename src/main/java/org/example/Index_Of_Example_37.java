package org.example;

public class Index_Of_Example_37 {
    public static void main(String[] args) {
        String s1="this fgindexhd is xfindexkj of asindexlo example bhindexsa";
//passing substring
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index1+" "+index2);//2 8
        //passing substring with from index
        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
        System.out.println(s1.replace("index","sindex"));
        System.out.println(s1.replaceAll("index","sindex"));
        System.out.println(s1.replaceFirst("index","sindex"));

    }
}