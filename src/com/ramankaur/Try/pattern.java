package com.ramankaur.Try;

import com.ramankaur.ST2Practice.String;

public class pattern {
   public static void main(String[] args){
        int row=4;
        int num=0;
        for(int i=0;i<row;i++){
            int count=0;
            for(int k=0;k<i;k++){
                System.out.print("*");count++;
            }
            for(int j=count;j<4;count++){
                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }
}
