package com.pb.volkov.hw8;

import java.util.Objects;

public class Auth {

    private String login;
    private String password;

    public Auth(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        signUp(login, password, confirmPassword);
    }

    private void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String loginRules = "^[a-zA-Z\\d]+$";

        if(login == null || login.length() < 5 || login.length() > 20 || !login.matches(loginRules)) {
            System.out.println("Ошибка регистрации!");
            throw new WrongLoginException("Логин должен состоять из латинских букв и цифр!");
        }
        else {
            this.login = login;
        }

        String passwordRules = "^[a-zA-Z\\d_]+$";

        if(password == null || password.length() < 6 || !password.matches(passwordRules) || !password.equals(confirmPassword)) {
            System.out.println("Ошибка регистрации!");
            throw new WrongPasswordException("Пароль должен состоять из латинских букв и цифр и может содержать символ нижнего подчеркивания!");
        }
        else {
            this.password = password;
        }

        System.out.println("Успешная регистрация!");
    }

    public void signIn(String login, String password) throws WrongLoginException {

        if(login.equals(this.login) && password.equals(this.password)) {
            System.out.println("С возвращением, " + this.login + "!");
        }
        else {
            System.out.println("Ошибка авторизации!");
            throw new WrongLoginException("Проверьте введенные данные!");
        }
    }

    @Override
    public String toString() {
        return "Auth{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auth auth = (Auth) o;
        return Objects.equals(login, auth.login) && Objects.equals(password, auth.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

}