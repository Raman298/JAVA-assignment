package com.assignments.S5lec40;

import java.util.Scanner;

public class StairPyramidNum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner ( System.in );
//        int n = sc.nextInt ();
        int n = 7;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print ( j + " " );
            }
            System.out.println ();
        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=)
//        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    }