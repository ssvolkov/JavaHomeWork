package com.pb.volkov.hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args)
    {
        System.out.println("Введите слово или фразу, а программа заменит все первые буквы на заглавные:");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] userPhrase = s.toCharArray();

        int i;
        for (i = 0; i < userPhrase.length; i++) {
            userPhrase[0] = Character.toUpperCase(userPhrase[0]);
            if (userPhrase[i] == (' ')) {
                userPhrase[i + 1] = Character.toUpperCase(userPhrase[i + 1]);
            }
        }
        System.out.println(userPhrase);
        System.out.println("Все готово!");
    }
}