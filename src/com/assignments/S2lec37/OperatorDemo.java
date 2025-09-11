package com.assignments.S2lec37;

public class OperatorDemo {

        public static void main(String[] args) {
            int a = 10;
            int b = 5;
            a += 2;
            b *= 3;

            boolean isEqual = (a == b);
            boolean isGreater = (a > b);
            boolean isLessOrEqual = (a <= b);

            boolean andResult = (isEqual && isGreater);
            boolean orResult = (isEqual || isGreater);
            boolean notResult = !(isLessOrEqual);

            String result = (a > b) ? "a is bigger" : "b is bigger or equal";

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("a == b? " + isEqual);
            System.out.println("a > b? " + isGreater);
            System.out.println("a <= b? " + isLessOrEqual);
            System.out.println("AND Result: " + andResult);
            System.out.println("OR Result: " + orResult);
            System.out.println("NOT Result: " + notResult);
            System.out.println("Ternary Result: " + result);
        }
    }


