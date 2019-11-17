package com.teachmeskill.taskonlesson;

public class DollarConverter implements ConvertedCurrency {

    @Override
    public double getConverterCurrency(int myCurrency) {
        return  myCurrency * 2.045 ;
    }
}
