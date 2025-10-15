package com.ramankaur.S1Lec57;

public class SingleNumber {
        public int singleNumber(int[] nums) {
            int a=0;
            for(int i=0;i<nums.length;i++){
                a^=nums[i];
            }
            return a;
        }
    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        int[] nums = {2, 3, 5, 3, 2};
        int result = sol.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
    }