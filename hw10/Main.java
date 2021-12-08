package com.pb.volkov.hw10;

public class Main {
    public static void main(String[] args) throws Exception {

        NumBox<Integer> objInt = new NumBox<>(4);
        try {
            objInt.add(12);
            objInt.add(31);
            objInt.add(20);
            objInt.add(8);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Integer");
        System.out.println("Число по индексу: " + objInt.get(1));
        System.out.println("Количество элементов: " + objInt.length());
        System.out.println("Сумма всех элементов: " + objInt.sum());
        System.out.println("Среднее арифметическое: " + objInt.average());
        System.out.println("Максимальный элемент: " + objInt.max());

        NumBox<Float> objFloat = new NumBox<>(3);
        try {
            objFloat.add(11.2f);
            objFloat.add(8.4f);
            objFloat.add(5.0f);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Float");
        System.out.println("Число по индексу: " + objFloat.get(1));
        System.out.println("Количество элементов: " + objFloat.length());
        System.out.println("Сумма всех элементов: " + objFloat.sum());
        System.out.println("Среднее арифметическое: " + objFloat.average());
        System.out.println("Максимальный элемент: " + objFloat.max());

    }
}