package com.ramankaur.S5lec45;

import java.util.Scanner;

public class TimeComplexity {
    static int binary(int[] arr,int target){
        int left=0,right=arr.length-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) return mid;
            else if (target > arr[mid]){
                left=mid+1;
            }
            else{right=mid-1;}
        }
        return -1;
    }
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] arr=new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        long linearstart=System.nanoTime();
        int linear=linearSearch(arr,target);
        long linearEnd=System.nanoTime();

        long binarystart=System.nanoTime();
        int binary=linearSearch(arr,target);
        long binaryEnd=System.nanoTime();

        long lineartime=linearEnd-linearstart;
        long binarytime=binaryEnd-binarystart;
        System.out.println("Time taken by linear search "+lineartime);
        System.out.println("Time taken by binary search "+binarytime);


    }
}
