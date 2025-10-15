package com.ramankaur.S1Lec57;

//public class StaticInstance {
//}
class Student {
    static String schoolName = "Greenwood High";
    String studentName;
    int rollNumber;

    Student(String name, int roll) {
        studentName = name;
        rollNumber = roll;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("School Name: " + schoolName);
        System.out.println("---------------------------");
    }
}

public class StaticInstance {
    public static void main(String[] args) {
        Student s1 = new Student("Raman", 101);
        Student s2 = new Student("Akur", 102);

        System.out.println("Accessing static variable directly:");
        System.out.println("School Name: " + Student.schoolName);
        System.out.println();

        s1.display();
        s2.display();

        Student.schoolName = "Sunrise Academy";

        System.out.println("After changing static variable:");
        s1.display();
        s2.display();
    }
}
