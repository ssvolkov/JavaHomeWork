package com.pb.volkov.hw12;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        PhoneBook con = new PhoneBook();
        List<Contact> contact = Arrays.asList(

                new Contact("Олег", LocalDate.of(1986, 5, 12), "380674512012", "г. Львов"),
                new Contact("Михаил", LocalDate.of(1977, 2, 3), "380638705530", "г. Полтава"),
                new Contact("Сергей", LocalDate.of(1990, 11, 23), "380986112021", "г. Борисполь"));
        System.out.println("Список телефонной книги");

        contact.stream()
                .collect(Collectors.groupingBy(Contact:: getDateOfBirth))
                .entrySet()
                .forEach(System.out::println);

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");

        List<String> listToSort = new ArrayList<>();
        Set<String> uniqueValues = new HashSet<>();
        for (Contact contact2 : contact) {
            String name = contact2.getName();
            if (uniqueValues.add(name)) {
                listToSort.add(name);
            }
        }

        for (String name : listToSort) {
            System.out.println(name);
        }

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");

        int flag = 0;
        while(flag==0){
            System.out.println ("Меню списка контактов:");
            System.out.println ("1. Добавить, " + "2. Удалить, " + "3. Изменить, " + "4. Показать все контакты, " +
                    "5. Поиск, " + "6. Читать и отобразить, " + "7. Сохранить телефонную книгу, " +
                    "8. Очистить, " + "9. Выход");

            System.out.println("Выбирите действие:");
            Scanner sc1 = new Scanner(System.in);
            switch (sc1.nextInt()) {
                case 1:
                    con.add();
                    break;
                case 2:
                    con.del();
                    break;
                case 3:
                    con.change();
                    break;
                case 4:
                    con.show();
                    break;
                case 5:
                    con.search();
                    break;
                case 6:
                    con.open1();con.show();
                    break;
                case 7:
                    con.save1();
                    break;
                case 8:
                    con.clear();
                    break;
                case 9:
                    flag=1;
                    break;
                default:
                    break;
            }
        }

    }

}