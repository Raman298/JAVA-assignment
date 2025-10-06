package com.ramankaur.Fa3Practice;

import java.util.Scanner;

public class prime {
    public static void prime(int n){
        for(int j=101;j<=n;j++) {
            boolean isprime = true;
            for (int i = 2; i < n / 2; i++) {

                if (j % i == 0) {
                    isprime = false;

                    break;

                }

            }
            if(isprime) {
                System.out.println ( j );
                break;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);



        }
    }

