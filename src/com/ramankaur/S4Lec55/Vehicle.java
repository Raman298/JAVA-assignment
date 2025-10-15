package com.ramankaur.S4Lec55;

public class Vehicle {
    String brand;
    public Vehicle(String brand){
        this.brand=brand;
    }
    public String toString(){
        return "vehicle101";
    }
    public int hashcode(){
        return 100;
    }
    public static void main(String[] args){
        Vehicle v=new Vehicle("Car");
        System.out.println(v);
        System.out.println(v.toString());
        System.out.println(v.hashcode());
    }
}
