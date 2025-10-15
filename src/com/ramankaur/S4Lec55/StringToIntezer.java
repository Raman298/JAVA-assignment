package com.ramankaur.S4Lec55;
import java.util.Scanner;
public class StringToIntezer {
    public int myAtoi(String s) {
        int i=0,n=s.length();
        while(i<n&&s.charAt(i)==' ')i++;
        if(i==n)return 0;

        int sign=1;
        if(s.charAt(i)=='+'|| s.charAt(i)=='-'){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        long result=0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));
            result = result * 10 + digit;
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringToIntezer obj = new StringToIntezer();
        int result = obj.myAtoi(s);
        System.out.println(result);
    }
}
