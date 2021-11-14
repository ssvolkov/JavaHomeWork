package com.pb.volkov.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String exit;
        int a;
        int attempt = 1;
        int min = 0;
        int max = 100;
        int x = random.nextInt((max - min) + 1) + min;

        System.out.println(x);
        System.out.println("Сможете ли Вы угадать число от 0 до 100?");
        a = scan.nextInt();

        if (a == x) {
            System.out.println("Ура! Вам удалось угадать с " + attempt + " попытки!");
        }
        while (a != x) {
            attempt++;
            System.out.println("Не угадали! Попробуйте еще разок.");
            if (a > x) {
                System.out.println("Задуманное число меньше введенного!");
            }
            if (a < x) {
                System.out.println("Задуманное число больше введенного!");
            }
            System.out.println("Для продолжения введите Yes, для выхода из игры введите Exit.");

            exit = scan.next();
            if (exit.equals("Exit")) {
                System.out.println("Спасибо за игру!");
                break;
            }
            System.out.println("Ваша попытка: " + attempt +"." + "Сможете ли Вы угадать число от 0 до 100?");
            a = scan.nextInt();
            if (a == x) {
                System.out.println("Ура! Вам удалось угадать с " + attempt + " попытки!");
                return;
            }
        }


    }
}