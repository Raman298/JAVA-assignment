package com.assignments.S5lec40;

public class InvertedTriangle {
    public static void main(String args[]){
        int row=5;
//        for(int i=0;i<row;i++){
//            for(int j=0;j<row-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//
//        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
