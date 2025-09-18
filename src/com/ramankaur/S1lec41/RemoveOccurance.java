package com.ramankaur.S1lec41;

//public class RemoveOccurance {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,1,4,2,5};
//        int b=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==2){
//                b++;
//                continue;
//            }
//
//            System.out.println(arr[i]);
//        }
//    }
//}

import java.util.Arrays;

public class RemoveOccurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,2,5};
        int value_remove=2;
        int count=0;
        for(int i:arr){
            if(i!=value_remove){
                count++;
            }
        }
        int arr1[]= new int[count];
        int index=0;
        for(int i:arr){
            if(i!=value_remove){
            arr1[index++]=i;}
        }
        System.out.println( Arrays.toString(arr1));

    }
}
