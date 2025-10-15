package com.ramankaur.S4Lec55;

public class StringToInt {
    public static void main(String[] args){
        int a=10;
        String str = "12345";

        // Convert String to int using wrapper method
        int num = Integer.parseInt(str);

        // Print the result
        System.out.println("Converted integer: " + num);
    }
}
