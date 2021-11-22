package com.pb.volkov.hw9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) {
        createNumbersFile();
        createOddNumbersFile();
    }

    static void createNumbersFile() {
        Random random = new Random();
        try (Writer writer = new FileWriter("C:\\Java\\hw9\\numbers.txt")) {
            int x;
            int count = 0;
            for (x = 0; x < 100; x++) {
                writer.write(random.nextInt(100) + " ");
                count++;
                if (count % 10 == 0) {
                    writer.write("\n");
                }
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void createOddNumbersFile() {
        Path path = Paths.get("C:\\Java\\hw9\\numbers.txt");
        try (Scanner scanner = new Scanner(path)) {
            int[] i = new int[100];
            int x;
            int y;
            int counter = 0;
            while (true) {
                for (x = 0; x < i.length; x++) {
                    i[x] = scanner.nextInt();
                    if (i[x] % 2 == 0) {
                        i[x] = 0;
                    }
                }

                try (Writer writer = new FileWriter("C:\\Java\\hw9\\odd-numbers.txt")) {
                    for (y = 0; y < 100; y++) {
                        writer.write(i[y] + " ");
                        counter++;
                        if (counter % 10 == 0) {
                            writer.write("\n");
                        }
                    }

                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

        } catch (NoSuchElementException ex) {
            System.out.println("Программа выполнила условия. Четные числа заменены на 0.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}