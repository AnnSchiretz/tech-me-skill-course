package com.teachmeskill.hometask8;
import java.util.Scanner;

public class WordReplacementApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        createNewWord(scan);
        //createWordSeconWay(scan);
    }
    public static void createNewWord (Scanner scan){
        System.out.println("Введите слово из 4х букв :");
        String firstUserWord = scan.nextLine();
        System.out.println("Введите второе слово :");
        String secondUserWord = scan.nextLine();
        char[] myChar = new char[4];
        firstUserWord.getChars(0, 2, myChar, 0);
        secondUserWord.getChars(2, 4, myChar, 2);
        String result = String.valueOf(myChar);
        System.out.println(result);
    }
//    public static void createWordSeconWay (Scanner scan){
//        System.out.println("Введите слово из 4х букв :");
//        String firstUserWord = scan.nextLine();
//        System.out.println("Введите второе слово :");
//        String secondUserWord = scan.nextLine();
//        firstUserWord = firstUserWord.concat(secondUserWord);
//        StringBuilder newStr = new StringBuilder(firstUserWord);
//        System.out.println(newStr.substring(2, 6));
//    }
}
