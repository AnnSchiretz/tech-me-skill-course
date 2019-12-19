package com.teachmeskill.taskonlesson;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int [][] myArray = new int [5][6];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = (int) (Math.random() * 99);
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
