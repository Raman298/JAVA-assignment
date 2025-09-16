package com.assignments.S1lec41;

public class SumArrElements {
        public static void main(String[] args) {
//    int[] arr= {1,2,3,4,5};
            int[] numbers = new int[5]; // Declaration with size 5
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;

            numbers[3] = 40;
            numbers[4] = 50;
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.print (sum);


        }

}
