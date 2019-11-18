package com.teachmeskill.taskonlesson;

public class DollarConverter implements CurrencyConverter {

    @Override
    public double getConverterCurrency(int myCurrency) {
        return  myCurrency * 2.045 ;
    }
}
