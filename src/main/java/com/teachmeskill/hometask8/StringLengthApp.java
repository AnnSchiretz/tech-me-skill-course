package com.teachmeskill.hometask8;

import java.util.Scanner;

public class StringLengthApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int userCountString = Integer.parseInt(scan.nextLine());
        String shortStr = null;
        String longStr = null;

        printLengthString(userCountString, shortStr, scan, longStr);

    }

    public static void printLengthString(int userCountString, String shortStr, Scanner scan, String longStr) {
        for (int i = 0; i < userCountString; i++) {
            System.out.println("Введите строку" + (i + 1));
            String currentStr = scan.nextLine();
            if (shortStr == null || currentStr.length() < shortStr.length()) {
                shortStr = currentStr;
            } else if (longStr == null || currentStr.length() > longStr.length()) {
                longStr = currentStr;
            }
        }
        System.out.println("Короткая строка: " + shortStr);
        System.out.println("Количество элементов: " + shortStr.length());
        System.out.println("Длинная строка: " + longStr);
        System.out.println("Количество элементов: " + longStr.length());
    }
}
