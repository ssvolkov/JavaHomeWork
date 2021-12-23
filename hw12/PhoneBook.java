package com.pb.volkov.hw12;

import javax.management.ObjectName;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    private  Scanner sc;
    HashMap<String, Contact> hm= new HashMap<>();

    public void add(){
        sc = new Scanner(System.in);
        System.out.println ("Добавить контакт");
        System.out.println ("Имя: ");
        String name=sc.nextLine();
        System.out.println ("Дата рождения: ");
        String dateOfBirth=sc.nextLine();

        System.out.println ("Телефон: ");
        String phone=sc.nextLine();
        System.out.println("Адрес: ");
        String address=sc.nextLine();

        System.out.println ( "Дата добавления контакта: ");
        Date date = new Date();

        System.out.println(date);

        Contact newOne = new Contact(name, LocalDate.now(), phone, address);
        hm.put (name, newOne);
        System.out.println ("Контакт добавлен!");
    }

    public void del(){
        sc = new Scanner(System.in);
        System.out.println ("Удалить контакт");
        System.out.println ("Введите имя контакта для его удаления: ");
        String name=sc.nextLine();
        if (hm.containsKey (name)) {

            System.out.println(hm.get(name).toString());
            System.out.println ("Для подтверждения удаления введите 0");

            int flag=sc.nextInt();
            if(flag==0){
                hm.remove(name);
                System.out.println ("Контакт удален!");
            }else{
                System.out.println ("Отменить удаление");
            }
        }else{
            System.out.println ("Такого контакта не существует!");
        }

    }

    public void change(){
        sc = new Scanner(System.in);
        System.out.println ("Изменить контакт");
        System.out.println ("Введите имя контакта для изменения: ");
        String name=sc.nextLine();
        if (hm.containsKey (name)) {
            System.out.println(hm.get(name).toString());
            hm.remove (name);
            System.out.println ("Введите новые данные");
            System.out.println ("Имя: ");
            String name1=sc.nextLine();
            System.out.println ("Дата рождения: ");
            String dateOfBirth=sc.nextLine();

            System.out.println ("Телефон: ");
            String phone=sc.nextLine();
            System.out.println("Адрес: ");
            String address = sc.nextLine();

            System.out.println ("Дата редоктирования: ");
            Date date = new Date();
            System.out.println(date);
            Contact newOne=new Contact(name1,  LocalDate.now(), phone, address);
            hm.put (name, newOne);
            System.out.println ("Контакт изменен!");
        }else{
            System.out.println ("Такого контакта не существует!");
        }
    }

    public void show(){
        System.out.println ("Показать список контактов");
        for (Map.Entry<String, Contact> entry : hm.entrySet()) {
            System.out.println(entry.getValue().toString());
        }

    }

    public void search(){
        sc = new Scanner(System.in);
        System.out.println ("Поиск");
        System.out.println ("Введите имя контакта для поиска: ");
        String name=sc.nextLine();
        if(hm.containsKey(name)){
            System.out.println(hm.get(name).toString());
        }else{
            System.out.println ("Такого контакта не существует!");
        }
    }

    public void clear(){
        hm.clear();
    }

    public void open1() throws Exception{
        System.out.println ( "Read ...");
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("files/ListFirst.txt"));
        boolean flag=true;
        while(flag){
            try{
                Contact newOne=(Contact) in.readObject();
                hm.put (newOne.getName (), newOne);
            }catch(EOFException e){
                flag=false;
            }
        }
        in.close();

    }

    public void save1() throws Exception{
        System.out.println ( "Сохранить ...");
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("files/ListFirst.txt"));
        for (Map.Entry<String, Contact> entry : hm.entrySet()) {
            Contact val = entry.getValue();
            out.writeObject(val);
        }
        out.close();
        System.out.println ("Время сохранения: ");
        Date date = new Date();

        System.out.println(date);
        System.out.println ("Сохранено!");
    }

}