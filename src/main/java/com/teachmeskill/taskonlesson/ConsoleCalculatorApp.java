package com.teachmeskill.taskonlesson;

import java.util.Scanner;

public class ConsoleCalculatorApp {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char operation = 0;
        int result = 0;
        System.out.println("Введите числa : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Введите операцию");
        operation = scan.next().charAt(0);
        switch (operation){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case ':' :
                result = num1 / num2;
                break;
            default :
                System.out.println("Операция не верна. Повторите ввод");
        }
        System.out.println("Результат: " +result);
    }
}


