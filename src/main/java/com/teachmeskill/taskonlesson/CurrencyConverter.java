package com.teachmeskill.taskonlesson;

public interface CurrencyConverter {

    double getConverterCurrency (int myCurrency);

    default void printCurrency () {
        System.out.println("Dollar");
    }
}
