package com.ramankaur.S1Lec52;

class Car{
    public String make;
    public int year;
}
public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.make="thar";
        car1.year=2007;
        System.out.println(car1.make);
        System.out.println(car1.year);
    }
}