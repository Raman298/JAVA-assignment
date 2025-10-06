package com.ramankaur.S4lec44;

import java.util.Scanner;

public class Sum {
    int sum(int n){
        if(n==0) return 0;
        return n+ sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sum s=new Sum();
        int result=s.sum(n);
        System.out.println(result);

    }
}
