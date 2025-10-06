package com.ramankaur.S1Lec52;


    class Person {
        public String name;
        private int age;
        private String address;

        public Person(String n, int a, String addr) {
            name = n;
            age = a;
            address = addr;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }


        public void printAddress() {
            System.out.println("Address: " + address);
        }
    }

public class ChangeField {
        public static void main(String[] args) {
            Person p = new Person("Rita", 22, "Delhi");
            p.displayInfo();
            p.printAddress();
        }
    }

