package com.rms.grr.controller;

public class Reverse {

    public static void main(String[] args) {

        String finalValue = reversString("Ratnkaar");
            System.out.println(finalValue);
    }

    public static String reversString(String name){
        String reversedString="";

        for(int i = name.length()-1;i >=0;i--){
            reversedString += name.charAt(i);
        }

        return reversedString;
    }
}
