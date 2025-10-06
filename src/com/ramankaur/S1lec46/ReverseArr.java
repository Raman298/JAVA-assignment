package com.ramankaur.S1lec46;

import java.util.Scanner;

public class ReverseArr {
    void reverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
        int[] arr={1,2,3,4,5};
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        ReverseArr obj=new ReverseArr();
        obj.reverse(arr);

    }
}
