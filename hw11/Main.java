package com.pb.volkov.hw11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception  {
        PhoneBook con =new PhoneBook();

        int flag = 0;
        while(flag==0){
            System.out.println ("Меню списка контактов:");
            System.out.println ("1. Добавить, " + "2. Удалить, " + "3. Изменить, " + "4. Показать все контакты, " +
                    "5. Поиск, " + "6. Читать и отобразить, " + "7. Сохранить телефонную книгу, " +
                    "8. Очистить, " + "9. Выход");

            System.out.println ("Выберите действие:");
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
                    con.openListFirst();con.show();
                    break;
                case 7:
                    con.saveListFirst();
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