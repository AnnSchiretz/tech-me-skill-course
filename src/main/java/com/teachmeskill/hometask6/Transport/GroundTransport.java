package com.teachmeskill.hometask6.Transport;

import java.util.Objects;

class GroundTransport extends Transport {
    private int amountWheells;
    private float fuelConsumption;

    public GroundTransport(){

    }
    public GroundTransport(float power, int maxSpeed, float weight, String mark, int amountWheells, float fuelConsumption) {
        super(power, maxSpeed, weight, mark);
        this.amountWheells = amountWheells;
        this.fuelConsumption = fuelConsumption / 100;
    }

    @Override
    public String toString() {
        return "GroundTransport{" +
                "amountWheells=" + amountWheells +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroundTransport that = (GroundTransport) o;
        return amountWheells == that.amountWheells &&
                Float.compare(that.fuelConsumption, fuelConsumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountWheells, fuelConsumption);
    }

    public int getAmountWheells() {
        return amountWheells;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
}
