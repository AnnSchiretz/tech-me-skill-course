package com.teachmeskill.taskonlesson;

public class TemperatureConverterApp {

    public static void main(String[] args) {
        double temperature = 56.7;
        System.out.println(new CelsiusConverter().getConversionTemperature(temperature));
        System.out.println(new FarenheitConverter().getConversionTemperature(temperature));
        System.out.println(new KelvinConverter().getConversionTemperature(temperature));
    }
}
