package com.assignments.S5lec40;

import java.util.Scanner;

public class StaircasePyramidWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int l=word.length();
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                System.out.print(word.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
