package com.pb.volkov.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую фразу: ");
        String PhraseFir = (sc.nextLine()).toLowerCase();

        System.out.print("Введите вторую фразу: ");
        String PhraseSec = (sc.nextLine()).toLowerCase();

        char[] nPhraseFir = sort(checkSymbol(PhraseFir));
        char[] nPhraseSec = sort(checkSymbol(PhraseSec));

        if (Arrays.equals(nPhraseFir, nPhraseSec)){
            System.out.println("Строки являются анаграммами.");
        }

        else {
            System.out.println("Строки не являются анаграммами.");
        }
    }

    public static String checkSymbol(String str) {
        StringBuilder pResult = new StringBuilder();
        for (Character ch : str.toCharArray()) {
            if(Character.isLetterOrDigit(ch))
                pResult.append(ch);
        }
        return pResult.toString();
    }

    static char[] sort (String str){
        char[] chArray = str.toCharArray();
        Arrays.sort(chArray);
        return chArray;
    }
}