package com.teachmeskill.hometask7.Magazine;

import java.util.Arrays;

public class Magazine implements Printer {

    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }

//    static void printMagazine (Printout[] array){
//        for(Printout printout : array) {
//            if (printout instanceof Magazine) {
//                Magazine magazine = (Magazine) printout;
//                System.out.println(magazine.name);
//            }
//        }
//    }

//    static void printMagazine (Printout[] array){
//        for (int i = 0; i < array.length; i++){
//            if(array[i] instanceof Magazine == true){
//                Magazine magazine = (Magazine) array[i];
//                System.out.println(magazine.name);
//            }
//        }
//    }

    static void printMagazine (Printer[] array){
        Arrays.stream(array)
                .filter(cell -> cell instanceof Magazine)
                .forEach(cell -> System.out.println(((Magazine) cell).name));
    }
}
