package com.teachmeskill.hometask7.Magazine;

public class MarketApp  {
    public static void main(String[] args) {
        Printer[] print = new Printer[]{
                 new Book("Misery"),
                 new Magazine("The New York Times")
        };

        for(int i = 0; i < print.length ; i++){
            //print[i].print();
        }

        Magazine.printMagazine(print);
        //Book.printBooks(print);
    }
}
