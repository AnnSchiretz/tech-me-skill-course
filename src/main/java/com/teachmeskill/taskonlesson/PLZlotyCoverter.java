package com.teachmeskill.taskonlesson;

public class PLZlotyCoverter implements CurrencyConverter {
    @Override
    public double getConverterCurrency(int myCurrency) {
        return myCurrency * 0.518;
    }
}
