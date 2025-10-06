package com.ramankaur.S5lec45;

import java.util.Scanner;

public class BinarySearch {
    int binary(int[] arr,int target){
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
    public static void main(String[] args) {
        int[] arr=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        BinarySearch bs=new BinarySearch();
        int target=sc.nextInt();
        int result=bs.binary(arr,target);
        System.out.println(result);


    }
}
