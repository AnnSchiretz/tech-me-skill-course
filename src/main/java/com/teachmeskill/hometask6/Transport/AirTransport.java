package com.teachmeskill.hometask6.Transport;

class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLength;

    public AirTransport(){

    };

    public AirTransport(float power, int maxSpeed, float weight, String mark, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, mark);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }
}
