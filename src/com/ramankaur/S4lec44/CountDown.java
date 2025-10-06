package com.ramankaur.S4lec44;

import java.util.Scanner;

public class CountDown {
    void  countDown(int n) {

        if(n==0) return ;
        System.out.println(n);

        countDown ( n-1 );



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CountDown obj = new CountDown();
        obj.countDown(n);               // no need to store result


//        System.out.println(result);

    }
}
