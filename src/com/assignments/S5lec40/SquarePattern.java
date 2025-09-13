package com.assignments.S5lec40;

public class SquarePattern {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        for(int j=0;j<rows;j++){
            for(int k=0;k<cols;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
