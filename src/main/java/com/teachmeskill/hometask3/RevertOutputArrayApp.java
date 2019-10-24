package com.teachmeskill.hometask3;

public class RevertOutputArrayApp {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        int[] myArray = new int[50];
        int j = 1;

        for (int i = 0; i < myArray.length; i++, j += 2) {
            myArray[i] = j;
            System.out.print(myArray[i] + " ");
        }
        System.out.println(newLine);
        for (int i = 50 - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}
