package com.ramankaur.S2lec47;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr={2,6,3,9,6,4,3};
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println( Arrays.toString(arr));
    }
}
