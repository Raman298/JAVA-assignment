package com.assignments.S3lec38;

public class MarksIfElse {
        public static void main(String[] args) {
            int marks = 85;  // Direct value assignment

            if (marks >= 90 && marks <= 100) {
                System.out.println("Excellent");
                return;
            } else if (marks >= 75) {
                System.out.println("Very Good");
                return;
            } else if (marks >= 60) {
                System.out.println("Good");
                return;
            } else if (marks >= 40) {
                System.out.println("Average");
                return;
            } else if (marks >= 0) {
                System.out.println("Fail");
                return;
            } else {
                System.out.println("Invalid marks");
            }
        }


}
