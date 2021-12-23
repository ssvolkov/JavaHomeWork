package com.pb.volkov.hw12;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Contact implements Serializable {

    private String name;
    private transient LocalDate dateOfBirth;
    private  String phone;
    private  String address;
    private String editTime;

    public Contact(String name, LocalDate dateOfBirth, String phone, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        changed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(dateOfBirth, contact.dateOfBirth)
                && Objects.equals(phone, contact.phone) && Objects.equals(address, contact.address)
                && Objects.equals(editTime, contact.editTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, phone, address, editTime);
    }

    @Override
    public String toString() {
        return "Контакт: " +
                "Имя = '" + name + '\'' +
                ", Дата рождения = '" + dateOfBirth + '\'' +
                ", Телефон = '" + phone + '\'' +
                ", Адрес = '" + address + '\'' +
                ", Дата добавления контакта = '" + editTime + '\'';
    }

    private void changed() {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("Europe/Ukraine"));
        this.editTime = format.format(new GregorianCalendar().getTime());
    }

}