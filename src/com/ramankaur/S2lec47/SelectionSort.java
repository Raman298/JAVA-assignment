package com.ramankaur.S2lec47;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        SelectionSort obj=new SelectionSort();
        obj.selectionsort(arr);
        System.out.println( Arrays.toString(arr));

    }
}
