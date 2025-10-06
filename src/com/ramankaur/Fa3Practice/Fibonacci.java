package com.ramankaur.Fa3Practice;

public class Fibonacci {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int a=0,b=1;
        int fibo=0;
        for(int i=2;i<n;i++){
            System.out.print(a+" ");
            fibo=a+b;
            a=b;
            b=fibo;


        }


    }
}
