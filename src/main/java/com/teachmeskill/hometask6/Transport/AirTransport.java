package com.teachmeskill.hometask6.Transport;

import java.util.Objects;

class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLength;

    public AirTransport(){

    }

    public AirTransport(float power, int maxSpeed, float weight, String mark, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, mark);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "wingspan=" + wingspan +
                ", minRunwayLength=" + minRunwayLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirTransport that = (AirTransport) o;
        return wingspan == that.wingspan &&
                minRunwayLength == that.minRunwayLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wingspan, minRunwayLength);
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }
}
