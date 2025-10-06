package com.ramankaur.S5lec45;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(arr[i]+ " found at index "+ i);
                return;
            }

        }
    }
}
