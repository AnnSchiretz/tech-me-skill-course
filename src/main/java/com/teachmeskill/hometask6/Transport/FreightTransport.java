package com.teachmeskill.hometask6.Transport;

class FreightTransport extends GroundTransport {
    private int carrying;

    public FreightTransport(){

    };
    public FreightTransport(float power, int maxSpeed, int weight, String mark, int amountWheells, float fuelConsumption, int carrying) {
        super(power, maxSpeed, weight, mark, amountWheells, fuelConsumption);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void checkCarryingCapacity(int cargoWeight, int carrying) {
        if (carrying == cargoWeight || cargoWeight <= carrying) {
            System.out.println("Грузовик загружен");
        } else if (cargoWeight > carrying) {
            System.out.println("Грузовик нужен больше");
        }

    }

    public void informationTruck() {
        System.out.print("Грузовой транспорт : " +
                " грузоподъемность = " + getCarrying() +
                ",количество колес = " + getAmountWheells() +
                ",потребление топлива = " + getFuelConsumption() +
                ", мощность = " + getPower() +
                ", мощность в килловатах = " + powerCalculation(getPower()) +
                ", максимальная скорость = " + getMaxSpeed() +
                ", вес = " + getWeight() +
                ", марка = '" + getMark() + '\n');
    }
}
