package com.ramankaur.S2lec47;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={2,6,3,9,6,4,3};
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println( Arrays.toString(arr));

    }
}
