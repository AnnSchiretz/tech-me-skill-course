package com.teachmeskill.hometask3;

public class ArrayOfEvenNumberApp {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int j = 2;

        for (int i = 0; i < myArray.length; i++, j += 2) {
            myArray[i] = j;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}