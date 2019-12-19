package com.teachmeskill.hometask6.Transport;

import java.util.Objects;

class PassengerTransport extends GroundTransport {
    private String typeBody;
    private int amountPassenger;

    public PassengerTransport(){

    }


    public PassengerTransport(float power, int maxSpeed, float weight, String mark, int amountWheells, float fuelConsumption, String typeBody, int amountPassenger) {
        super(power, maxSpeed, weight, mark, amountWheells, fuelConsumption);
        this.typeBody = typeBody;
        this.amountPassenger = amountPassenger;
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +
                "typeBody='" + typeBody + '\'' +
                ", amountPassenger=" + amountPassenger +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerTransport that = (PassengerTransport) o;
        return amountPassenger == that.amountPassenger &&
                Objects.equals(typeBody, that.typeBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeBody, amountPassenger);
    }

    public String getTypeBody() {
        return typeBody;
    }

    public int getAmountPassenger() {
        return amountPassenger;
    }

    private float printFuelConsumed(float distance) {
       float fuel =  distance * getFuelConsumption();
       return fuel;
    }

    private float calculationDistance(float time){
        float calculationDistance = getMaxSpeed() * time;
        printFuelConsumed(calculationDistance);
        return calculationDistance;
    }

    public void createDescription (int time, String mark, int maxSpeed){
        System.out.println("За время " + time + "ч автомобиль " + mark + " двигаясь с максимальной скоростью " +maxSpeed+"км/ч проедет "
                +calculationDistance(time)+ " км и израсходует " + printFuelConsumed(calculationDistance(time)) +" литров топлива" );
    }

    public void informationCar() {
        System.out.print("Автомобиль : " +
                "тип кузова = '" + getTypeBody() + '\'' +
                ", количество пассажиров = " + getWeight() +
                ", количество колес = " + getAmountWheells() +
                ", расход топлива = " + getFuelConsumption() +
                ", мощность = " + getPower() +
                ", мощность в килловатах = " + powerCalculation(getPower()) +
                ", максимальная скорость = " + getMaxSpeed() +
                ", вес = " + getWeight() +
                ", марка автомобиля = '" + getMark() + '\n');
    }
}
