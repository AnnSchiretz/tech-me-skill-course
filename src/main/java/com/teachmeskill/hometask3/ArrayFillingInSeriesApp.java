package com.teachmeskill.hometask3;

public class ArrayFillingInSeriesApp {
    public static void main (String[] args){
        int [] myArray = new int [10];

        for (int i = 0; i< myArray.length; i++){
            if (i %2 != 0){
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
            System.out.println(myArray[i]);
        }
    }
}
