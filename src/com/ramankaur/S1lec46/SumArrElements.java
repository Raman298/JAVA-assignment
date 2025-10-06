package com.ramankaur.S1lec46;

import java.util.Scanner;

public class SumArrElements {

        int sum(int[] arr){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
//            if(n==0) return 0;
//            return arr[n-1]+ sum(n-1);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            SumArrElements s=new SumArrElements ();
            int result=s.sum(arr);
            System.out.println(result);

        }
    }


