package com.teachmeskill.taskonlesson;

public class PLZlotyCoverter implements ConvertedCurrency {
    @Override
    public double getConverterCurrency(int myCurrency) {
        return myCurrency * 0.518;
    }
}
