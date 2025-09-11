package com.assignments.S1lec36;

public class Commandargu {

        public static void main(String[] args) {
            // Check if at least 3 arguments are provided
            if(args.length < 3) {
                System.out.println("Please provide 3 numbers as command line arguments.");
                return;
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            int sum = num1 + num2 + num3;
            System.out.println("Sum: " + sum);
        }
    }


