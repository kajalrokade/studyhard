package com.kajal.code;


//Stringbuilder
public class Main {
    public static void main(String[] args) {

    }
}

class CustomSTringBuilder{

    private String str;
    private int size;
    public CustomSTringBuilder(String str1){
        str = str1;
        size = str1.length();
    }

    //apend , remove

    public  CustomSTringBuilder append(String str1){
       str = str1 + str;
       return this;
    }

}
