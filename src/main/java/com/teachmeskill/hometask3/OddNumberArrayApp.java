package com.teachmeskill.hometask3;

public class OddNumberArrayApp {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        int j = 1;

        for (int i = 0; i < myArray.length; i++, j += 2) {
           myArray[i] = j;
           System.out.print(myArray[i]+" ");
        }
    }
}