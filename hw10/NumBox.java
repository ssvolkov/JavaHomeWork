package com.pb.volkov.hw10;

public class NumBox<T extends Number> {
    private final T[] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(T num) throws Exception {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                numbers[i] = num;
                return;
            }
        }

        throw new Exception("Массив заполнен");
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        int length = numbers.length;
        for (T number : numbers) {
            if (number == null) {
                length--;
            }
        }

        return length;
    }

    public double sum() {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public double average() {
        return sum() / length();
    }

    public T max() {
        T max = numbers[0];
        for (T number : numbers) {
            if (max.doubleValue() < number.doubleValue()) {
                max = number;
            }
        }

        return max;
    }

}