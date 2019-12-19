package com.teachmeskill.hometask7.Instruments;

public class Trumpet implements Instrument {
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter);
    }
}
