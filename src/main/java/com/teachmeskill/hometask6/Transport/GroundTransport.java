package com.teachmeskill.hometask6.Transport;

class GroundTransport extends Transport {
    private int amountWheells;
    private float fuelConsumption;

    public GroundTransport(){

    };
    public GroundTransport(float power, int maxSpeed, float weight, String mark, int amountWheells, float fuelConsumption) {
        super(power, maxSpeed, weight, mark);
        this.amountWheells = amountWheells;
        this.fuelConsumption = fuelConsumption / 100;
    }

    public int getAmountWheells() {
        return amountWheells;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
}
