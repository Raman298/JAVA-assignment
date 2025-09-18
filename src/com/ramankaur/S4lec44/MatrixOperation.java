package com.ramankaur.S4lec44;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int product=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    product*=arr[i][j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    arr[i][j]=product;
                }
            }
        }
//        for(int i=0;i<arr.length;i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print ( arr[i][j] + " ");
//            }
//            System.out.println ();
//        }

       System.out.println( Arrays.deepToString ( arr));
    }
}
