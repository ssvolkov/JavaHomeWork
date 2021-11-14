package com.pb.volkov.hw5;

public class Reader {
    String nameStudent;
    String numberTicket;
    String nameFaculty;
    String dateBirth;
    String numberPhone;

    public Reader(String nameStudent, String numberTicket, String nameFaculty, String dateBirth, String numberPhone) {
        this.nameStudent = nameStudent;
        this.numberTicket = numberTicket;
        this.nameFaculty = nameFaculty;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
    }

    public void getStudent() {
        System.out.print(nameStudent);
    }

    public void getReader() {
        System.out.print(nameStudent + ", " + "Номер билета - " + numberTicket + ", Факультет - " + nameFaculty + ", Дата рождения - " + dateBirth + ", Телефон - " + numberPhone + "\n");
    }

    public void takeBook(int n) {
        System.out.print(" получил: " + n + " книги\n");
    }

    public void takeBook(String... book) {
        System.out.print(" получил: ");
        for (String number : book) {
            System.out.print(number + ", ");
        }

        System.out.print("\n");
    }

    public void returnBook(int n) {
        System.out.print(" сдал: " + n + " книги\n");
    }

    public void returnBook(String... book) {
        System.out.print(" сдал: ");
        for (String number : book) {
            System.out.print(number + ", ");
        }

        System.out.print("\n");
    }
}