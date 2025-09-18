package com.ramankaur.S2lec42;

public class LargestElement {
    public static void main(String[] args) {
        int arr[][]={{1,2},{4,5,6}};

        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            int max=arr[0][0];
            System.out.println(arr[i].length);
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println(i+"th row largest element is "+ max);
        }
    }
}
