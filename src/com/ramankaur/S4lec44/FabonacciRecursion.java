package com.ramankaur.S4lec44;

import java.util.Scanner;

public class FabonacciRecursion {
    public static int Fabonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fabonacci(n-1)+Fabonacci(n-2);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fabonacci(n));

    }
}
