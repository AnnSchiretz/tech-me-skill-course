package com.teachmeskill.hometask3;

public class ArrayFillingApp {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[9] = 1;
        int j = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (i > 0) {
                myArray[j] = i;
                j++;
            }
            System.out.println(myArray[i]);
        }
    }
}
