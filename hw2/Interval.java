package com.pb.volkov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число:");
        int x = scan.nextInt();

        if (x>=0 && x <= 14)
            System.out.println("[0 -14]");
        if (x>=15 && x <= 35)
            System.out.println("[15 - 35]");
        if (x>=36 && x <= 50)
            System.out.println("[36 - 50]");
        if (x>=51 && x <= 100)
            System.out.println("[51 - 100]");
        if (x<0 || x>100)
            System.out.println("Число не попадает в предложенные интервалы.");
    }
}