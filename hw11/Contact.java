package com.pb.volkov.hw11;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Contact implements Serializable {

    private final String name;
    private final String dateOfBirth;
    private final String phone;
    private final String address;
    private String editTime;

    public Contact(String name, String dateOfBirth, String phone, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        ArrayList<String> attachedPhoneNumbers = new ArrayList<>();
        changed();
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Дата рождения: " + dateOfBirth + ", Телефон: " + phone +
                ", Адрес: " + address + ", Время добавления контакта: " + editTime;
    }

    private void changed() {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("Europe/Ukraine"));
        this.editTime = format.format(new GregorianCalendar().getTime());
    }

}