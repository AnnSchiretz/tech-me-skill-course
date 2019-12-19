package com.teachmeskill.hometask7.Instruments;

public class Guitar implements Instrument {
    int numbersOfString;

    public Guitar(int numbersOfString) {
        this.numbersOfString = numbersOfString;
    }

    @Override
    public void play() {
        System.out.println("играет гитара с количеством струн " + numbersOfString);
    }
}
