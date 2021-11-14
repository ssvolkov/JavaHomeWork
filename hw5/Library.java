package com.pb.volkov.hw5;

import static com.pb.volkov.hw5.Book.bookCounter;

public class Library {
    public static void main(String[] args) {

        Book bookFirst = new Book("Наука", "Петрушов А.В.", ", 2014 г.");
        Book bookSecond = new Book("Инженерная графика", "Чумаченко Г.В.", ", 2015 г.");
        Book bookThird = new Book("Психология", "Бутко М.П.", ", 2020 г.");
        Reader readerFirst = new Reader("Константинов И.Я.", "№ 5055-1621", "ФПКНУиТШ", "07.12.1984 г.", "+380671174543" + ".");

        System.out.println(bookFirst.getInfo());
        System.out.println(bookSecond.getInfo());
        System.out.println(bookThird.getInfo() + "\n");

        readerFirst.getReader();

        readerFirst.getStudent();
        readerFirst.takeBook(bookCounter);
        readerFirst.getStudent();
        readerFirst.takeBook(bookFirst.bookTitle, bookSecond.bookTitle, bookThird.bookTitle);
        readerFirst.getStudent();
        readerFirst.takeBook(bookFirst.getInfo(), bookSecond.getInfo(), bookThird.getInfo()); System.out.print("\n");

        readerFirst.getStudent();
        readerFirst.returnBook(bookCounter);
        readerFirst.getStudent();
        readerFirst.returnBook(bookFirst.bookTitle, bookSecond.bookTitle, bookThird.bookTitle);
        readerFirst.getStudent();
        readerFirst.returnBook(bookFirst.getInfo(), bookSecond.getInfo(), bookThird.getInfo());
    }
}