package com.teachmeskill.taskonlesson;

public class TwoDimensionalArrayApp {
    public static void main(String[] args) {
        int[][] myArray = new int[7][4];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = -5 + (int) (Math.random() * 5 + 1);
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        int minEl = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                if (myArray[i][j] < minEl) {
                    minEl = myArray[i][j];
                }
            }
        }
        System.out.println(minEl);
    }
}
