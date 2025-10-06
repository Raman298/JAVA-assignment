package com.ramankaur.S1Lec52;
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class School {
    public void printStudentDetails(Student s) {
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Grade: " + s.getGrade());
    }
}

public class StudentSchool {
    public static void main(String[] args) {
        Student st = new Student("Raman", 10);
        School sc = new School();
        sc.printStudentDetails(st);
    }
}

