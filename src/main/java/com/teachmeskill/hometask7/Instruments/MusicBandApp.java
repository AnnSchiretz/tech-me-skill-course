package com.teachmeskill.hometask7.Instruments;

import java.util.Arrays;

public class MusicBandApp {
    public static void main(String[] args) {
        Instrument[] myBand = new Instrument[]{
                new Guitar(5),
                new Trumpet(10),
                new Drum(25)
        };

//        for (Instrument array : myBand) {
//            array.play();
//        }

        Arrays.stream(myBand)
                .forEach(Instrument::play);

//        for (int i = 0; i < myBand.length; i++){
//            myBand[i].play();
//        }
    }
}
