package com.ramankaur.S1Lec57;

public class Book {
    String bookName;
    String authorName;
    static String sellerName = "SEPB";

    Book(String authorName, String bookName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }


    public static void main(String[] args) {
        Book b1 = new Book("N/w Analysis", "harry");
        System.out.println("Author name is " + b1.authorName + " Book name is " + b1.bookName);

    }
}

