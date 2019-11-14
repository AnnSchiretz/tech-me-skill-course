package com.teachmeskill.hometask6.Transport;

class Transport {
    private float power;
    private int maxSpeed;
    private float weight;
    private String mark;

    public Transport(){

    };

    public Transport(float power, int maxSpeed, float weight, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;

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
