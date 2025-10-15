package com.ramankaur.S2Lec53;

class Car{
    private String brand;
    String color;
    String engine;
    int price ;
    int seats;

    public Car(String brand, String color,String engine,int price,int  seats){
        this.brand=brand;
        this.color=color;
        this.engine=engine;
        this.price = price;
        this.seats=seats;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void getBrand(){
        System.out.println(this.brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Car obj1 = new Car("thar", "Black", "petrol", 1000000, 5);
        Car obj=new Car("audi","Blue","engine",7800000,5);

        obj1.setBrand("BMW");
        obj1.getBrand();
    }
}
