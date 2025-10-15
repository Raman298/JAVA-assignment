package com.ramankaur.S2Lec58;

public class Person {
    Person(){
        System.out.println("Hello");
    }
    Person(int b){
        System.out.println("value of b is "+ b);

    }

    public static void main(String[] args){
        Person P1=new Person();
        Person P2=new Person(3);

    }
}
