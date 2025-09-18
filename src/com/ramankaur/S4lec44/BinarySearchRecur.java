package com.ramankaur.S4lec44;

import java.util.Scanner;

public class BinarySearchRecur {
    int binarySearch(int[] arr,int left,int right,int target){
        if(left>right) return -1;
        int mid=(left+right)/2;
        if(target==arr[mid]) return mid;
        else if(target>arr[mid]) return binarySearch(arr,left,mid-1,target);
        else return binarySearch(arr,mid+1,right,target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7,8};
        BinarySearchRecur obj=new BinarySearchRecur();
        obj.binarySearch(arr,0,arr.length-1,target);
        System.out.println(obj);
    }
}
