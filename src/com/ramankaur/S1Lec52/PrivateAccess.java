package com.ramankaur.S1Lec52;
class Vehicle
{
    private int  model;
    public Vehicle(int m) {
        model = m;
    }

    public void printmodel(){
        System.out.println(model);

}


}
public class PrivateAccess {
    public static void main(String[] args){
//        Vehicle c1=new Vehicle(2017);
        Vehicle c1 = new Vehicle(2017);
        //c1.model=2017;
        c1.printmodel();

    }
}
