package com.ramankaur.S4Lec55;

import java.util.Scanner;

public class HappyNumber {
        private int getNext(int n){
            int sum=0;
            while(n>0){
                int num=n%10;
                sum+=num*num;
                n=n/10;
            }
            return sum;
        }
        public boolean isHappy(int n) {
            int slow=n;
            int fast=getNext(n);
            while(fast!=1&&slow!=fast){
                slow=getNext(slow);
                fast=getNext(getNext(fast));
            }
            return fast==1;

        }


        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            HappyNumber obj=new HappyNumber();
            boolean  result=obj.isHappy(n);
            System.out.println(result);


        }
    }

