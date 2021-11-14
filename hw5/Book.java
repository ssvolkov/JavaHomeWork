package com.pb.volkov.hw5;

public class Book {

    public static int bookCounter = 0;
    String bookTitle;
    String bookAuthor;
    String bookYear;

    public Book(String bookTitle, String bookAuthor, String bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        bookCounter++;
    }

    public String getInfo() {
        return bookTitle + " " + "(" + bookAuthor + bookYear + ")";
    }
}