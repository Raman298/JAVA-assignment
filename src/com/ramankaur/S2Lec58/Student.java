package com.ramankaur.S2Lec58;

class studentClass{
    String name;
    int rollNumber;
    int marks;
    static int totalStudents=0;
    studentClass(){
      //  this.rollNumber=rollNumber;
      //  totalStudents++;
//
    }
    studentClass(String name,
            int rollNumber,
            int marks
    ){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
        totalStudents++;
    }
    String calculateGrade(int marks){
        if(marks>=90) return "A";
        else if(marks>=75) return "B";
        else if(marks>=50) return "C";
        else return "F" ;

    }
    void printDetails(){
        System.out.println("("+name +","+ rollNumber+","+marks+","+calculateGrade(marks)+")");
    }
}
public class Student {
    static void main(String[] args) {
        studentClass s1=new studentClass("Raman",101,98);
        s1.printDetails();
        studentClass s2=new studentClass("Raman",101,93);
        s2.printDetails();
        System.out.println(studentClass.totalStudents);
    }
}
