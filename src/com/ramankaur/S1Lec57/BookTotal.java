package com.ramankaur.S1Lec57;

public class BookTotal {
    int books=0;
    String bookTitle;
    BookTotal(String bookTitle){
        this.bookTitle=bookTitle;
        this.books=++books;

    }
    void ClassBook(){
        System.out.println("Total no. of books is "+ books);
    }

    public static void main(String[] args){
        BookTotal b1= new BookTotal("yo");
        BookTotal b2=new BookTotal("ro");
        b1.ClassBook();
    }
}
