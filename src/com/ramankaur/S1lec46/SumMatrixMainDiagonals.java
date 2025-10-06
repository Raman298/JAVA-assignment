package com.ramankaur.S1lec46;

import java.util.Scanner;

public class SumMatrixMainDiagonals {
    int sumMainDigonal(int[][] arr){
        int sum=0;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(row==col){
                    sum+=arr[row][col];
                }
            }
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        SumMatrixMainDiagonals obj=new SumMatrixMainDiagonals();
        int result=obj.sumMainDigonal ( arr );
        System.out.println(result);
    }
}
