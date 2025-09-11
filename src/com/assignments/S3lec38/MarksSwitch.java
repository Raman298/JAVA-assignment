package com.assignments.S3lec38;

public class MarksSwitch {
        public static void main(String[] args) {
            int grade = 9; // 🔧 Change this value (1–10) to test different remarks

            switch (grade) {
                case 1:
                    System.out.println("Remark: Needs serious attention.");
                    break;
                case 2:
                    System.out.println("Remark: Needs  attention.");
                    break;
                case 3:
                    System.out.println("Remark: you can improve.");
                    break;
                case 4:
                    System.out.println("Remark: keep up you will do it");
                    break;
                case 5:
                    System.out.println("Remark: Fair effort, but room for improvement.");
                    break;
                case 6:
                    System.out.println("Remark: Well Fair effort, but room for improvement.");
                    break;
                case 7:
                    System.out.println("Remark: Good job!");
                    break;
                case 8:
                    System.out.println("Remark: Good job! a little effort need");
                    break;
                case 9:
                    System.out.println("Remark: Excellent performance!");
                    break;
            }
        }
}
