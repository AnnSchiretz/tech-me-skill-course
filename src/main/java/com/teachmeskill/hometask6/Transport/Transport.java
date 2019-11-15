package com.teachmeskill.hometask6.Transport;

import java.util.Objects;

class Transport {
    private float power;
    private int maxSpeed;
    private float weight;
    private String mark;

    public Transport(){

    }

    public Transport(float power, int maxSpeed, float weight, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;

    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.power, power) == 0 &&
                maxSpeed == transport.maxSpeed &&
                Float.compare(transport.weight, weight) == 0 &&
                Objects.equals(mark, transport.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, maxSpeed, weight, mark);
    }

    public float getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public float getWeight() {
        return weight;
    }

    public String getMark() {
        return mark;
    }

    public float powerCalculation(float power) {
        double kwInHour = 0.74;
        float powerCalculation = power * (float) kwInHour;
        return powerCalculation;
    }
}
