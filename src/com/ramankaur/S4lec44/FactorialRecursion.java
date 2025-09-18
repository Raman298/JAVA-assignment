package com.ramankaur.S4lec44;

import java.util.Scanner;

public class FactorialRecursion {
    public static int Factorial(int n){
        int factorial;
        if(n==1||n==0){
            return 1;
        }
        return n*Factorial (n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=Factorial(n);
        System.out.println(result);
    }
}
