package com.pb.volkov.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Auth auth = null;
        String login, password, passwordCheck;
        Scanner in = new Scanner(System.in);

        System.out.println("Давайте зарегистрируемся! Придумайте логин длинной 5-20 символов (Допустимые символы: a-z, A-Z, 0-9):");
        login = in.nextLine();

        System.out.println("Придумайте пароль длинной от 5 символов (Допустимые символы: a-z, A-Z, 0-9, _ ):");
        password = in.nextLine();

        System.out.println("Введите пароль еще раз:");
        passwordCheck = in.nextLine();

        try {
            auth = new Auth(login, password, passwordCheck);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.getMessage();
            exception.printStackTrace();
        }

        System.out.println("Для входа введите свой логин:");
        login = in.nextLine();

        System.out.println("Введите пароль:");
        password = in.nextLine();

        try {
            assert auth != null;
            auth.signIn(login, password);
        } catch (WrongLoginException exception) {
            exception.getMessage();
            exception.printStackTrace();
        }
    }

}