package com.teachmeskill.taskonlesson;

import java.util.Scanner;

public class ConverterCurrencyApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете валюту :");
        String currency = scan.nextLine();
        System.out.println("Введите количество : ");
        int myDollar = scan.nextInt();
        switch (currency){
            case "USD" :
                System.out.println(new DollarConverter().getConverterCurrency(myDollar));
                break;
            case "PLZ" :
                System.out.println(new PLZlotyCoverter().getConverterCurrency(myDollar));
                break;
        }

    }
}
