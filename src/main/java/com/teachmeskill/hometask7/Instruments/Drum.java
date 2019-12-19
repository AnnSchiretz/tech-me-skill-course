package com.teachmeskill.hometask7.Instruments;

public class Drum implements Instrument {
    int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play(){
        System.out.println("Играет барабан с размером " + size);
    }
}
