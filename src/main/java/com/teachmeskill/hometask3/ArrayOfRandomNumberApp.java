package com.teachmeskill.hometask3;

public class ArrayOfRandomNumberApp {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        String newLine = System.getProperty("line.separator");
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 99);
            System.out.print(myArray[i] + " ");
        }
        System.out.println(newLine);
        for (int i = 0; i< myArray.length; i++ , j = 0){
            if(myArray[i]%2 != 0){
                myArray[j] = myArray[i];
                System.out.print(myArray[j] + " ");
            }
        }
    }
}
