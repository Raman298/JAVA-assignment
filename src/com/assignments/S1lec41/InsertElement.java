package com.assignments.S1lec41;

public class InsertElement {
        public static void main(String[] args) {
//    int[] arr= {1,2,3,4,5};
            int[] numbers = new int[6]; // Declaration with size 5
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;

            numbers[3] = 40;
            numbers[4] = 50;
            numbers[5] = 60;
            numbers[2]=65;
            for (int i = 0; i < numbers.length; i++) {
                System.out.print (numbers[i]);
            }



        }



}
