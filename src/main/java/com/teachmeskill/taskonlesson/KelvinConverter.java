package com.teachmeskill.taskonlesson;

public class KelvinConverter implements TemperatureConversion {
    @Override
    public double getConversionTemperature(double myValue) {
        return myValue + 273.15;
    }
}
