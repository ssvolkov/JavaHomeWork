package com.pb.volkov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int operand1 = scan.nextInt();

        System.out.println("Введите второе число:");
        int operand2 = scan.nextInt();

        System.out.println("Введите символ: ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(operand1+" "+operator+" "+operand2+"= "+(operand1 + operand2));
                break;
            case '-':
                System.out.println(operand1+" "+operator+" "+operand2+"= "+(operand1 - operand2));
                break;
            case '*':
                System.out.println(operand1+" "+operator+" "+operand2+"= "+(operand1 * operand2));
                break;
            case '/':
                if (operand2 == 0)
                    System.out.println("Нельзя делить на ноль.");
                break;
        }
    }
}