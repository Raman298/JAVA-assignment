package com.ramankaur.Fa3Practice;

public class sumargnums {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<args.length;i++){
//            if(args[i]>0||args[i]<9)
            sum+=args[i].length();
        }

        System.out.println(sum);
    }
}
