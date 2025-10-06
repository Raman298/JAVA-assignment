package com.ramankaur.S1Lec52;

class BankAccount{
    private float balance;

    public BankAccount(float amount){
        this.balance = amount;
    }

    public void withDraw(float amount){
        if(balance>amount){
            balance -=amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void deposit(float amount){
        if(amount>0){balance+=amount;
            System.out.println("Deposited: " + amount);}
    }
    public double getBalance() {
        return balance;
    }
}
public class Bank {
    public static void main(String[] args){
        BankAccount Person1=new BankAccount(2500);
        Person1.deposit(500);
        System.out.println("Final Balance: " + Person1.getBalance());


    }
}
