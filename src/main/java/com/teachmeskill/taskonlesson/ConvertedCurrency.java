package com.teachmeskill.taskonlesson;

public interface ConvertedCurrency {

    double getConverterCurrency (int myCurrency);

    default void printCurrency () {
        System.out.println("Dollar");
    }
}
