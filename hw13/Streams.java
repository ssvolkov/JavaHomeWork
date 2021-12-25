package com.pb.volkov.hw13;

import java.util.ArrayList;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<Integer> sharedBuff = new ArrayList<>();

        Runnable prodRun = () -> {
            synchronized (sharedBuff) {
                try {

                    System.out.println("Запуск потока Производителя.");

                    while (true) {
                        while (sharedBuff.size() == 10) {
                            System.out.println("Производитель в ожидании очистки буфера.");
                            sharedBuff.wait();
                        }

                        while (sharedBuff.size() < 10) {
                            sharedBuff.add((int) ((Math.random() * 100) + 100));
                        }

                        System.out.println("Буфер заполнен. В буффере " + sharedBuff.size() + " компонентов:");
                        for (Integer p : sharedBuff)
                            System.out.print(p + " ");
                        System.out.println("\nПауза на 5 секунды.");
                        Thread.sleep(5000);
                        sharedBuff.notifyAll();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                    {
                    }
                }
            }
        };

        Runnable consRun = () -> {
            synchronized (sharedBuff) {
                try {

                    System.out.println("Запуск потока Потребителя.");

                    while (true) {

                        while (sharedBuff.size() == 0) {
                            System.out.println("Потребитель в ожидание очистки буфера.");
                            sharedBuff.wait();
                        }

                        System.out.println("Потребитель извлекает данные из буфера.");
                        for (Integer p : sharedBuff) {
                            System.out.print(p + " ");
                        }

                        sharedBuff.clear();
                        System.out.println("\nБуфер очищен. В буфере " + sharedBuff.size() + " компонентов.");

                        sharedBuff.notifyAll();

                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread producer = new Thread(prodRun);
        Thread consumer = new Thread(consRun);

        consumer.start();
        producer.start();

    }
}