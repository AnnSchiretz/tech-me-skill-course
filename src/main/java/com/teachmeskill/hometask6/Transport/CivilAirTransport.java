package com.teachmeskill.hometask6.Transport;

import java.util.Objects;

class CivilAirTransport extends AirTransport {
    private int amountPassengers;
    private boolean businessClass;

    public CivilAirTransport(){

    }
    public CivilAirTransport(float power, int maxSpeed, float weight, String mark, int wingspan, int minRunwayLength,
                             int amountPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, mark, wingspan, minRunwayLength);
        this.amountPassengers = amountPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "CivilAirTransport{" +
                "amountPassengers=" + amountPassengers +
                ", businessClass=" + businessClass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CivilAirTransport that = (CivilAirTransport) o;
        return amountPassengers == that.amountPassengers &&
                businessClass == that.businessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountPassengers, businessClass);
    }

    public int getAmountPassengers() {
        return amountPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void checkPassengerCapacity (int actualNumberPassenger, int amountPassengers){
        if(actualNumberPassenger == amountPassengers || actualNumberPassenger <= amountPassengers){
            System.out.println("Самолет загружен");
        } else if(actualNumberPassenger > amountPassengers){
            System.out.println("Требуется самолет больше");
        }
    }

    public void informationCivilPlane() {
        System.out.println( "Гражданский самолет : " +
                "количество пассажиров = " + getAmountPassengers() +
                ", наличие бизнес класса = " + isBusinessClass() +
                ", размах крыльев = " + getWingspan() +
                ", минимальная длинна взлетно-пасадочной полосы = " + getMinRunwayLength() +
                ", мощность = " + getPower() +
                ", мощность в килловатах = " + powerCalculation(getPower()) +
                ", максимальная скорость = " + getMaxSpeed() +
                ", вес = " + getWeight() +
                ", марка = '" + getMark() + '\n');
    }
}
