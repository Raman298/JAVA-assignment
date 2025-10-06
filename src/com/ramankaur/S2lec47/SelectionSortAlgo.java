package com.ramankaur.S2lec47;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args){
        int[] arr={2,6,3,9,6,4,3};
        for( int i=0;i<arr.length;i++){
            int minidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            int temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;
        }
        System.out.println( Arrays.toString(arr));
    }
}
