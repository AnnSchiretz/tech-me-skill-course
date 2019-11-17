package com.teachmeskill.taskonlesson;

public class FarenheitConverter implements TemperatureConversion {
    @Override
    public double getConversionTemperature(double myValue) {
        return 1.8 * myValue +32;
    }
}
