package com.ramankaur.S2lec42;

import java.util.Scanner;

public class SumEachColumn {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr[0].length;i++) {
            int sum=0;
                for (int j = 0; j < arr.length; j++) {
                    sum+=arr[j][i];
                }
            System.out.println(i + " th column elements sum is "+ sum);

        }

    }
}
