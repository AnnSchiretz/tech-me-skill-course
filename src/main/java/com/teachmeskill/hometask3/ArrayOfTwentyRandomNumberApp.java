package com.teachmeskill.hometask3;

public class ArrayOfTwentyRandomNumberApp {
    public static void main(String[] args){
        String newLine = System.getProperty("line.separator");
        int [] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 20);
            System.out.print(myArray[i] + " ");
        }
        System.out.println(newLine);
        for (int i = 0; i< myArray.length; i++){
            if(myArray[i]%2 != 0){
                myArray[i] = 0;
            }
            System.out.print(myArray[i] + " ");
        }
    }
}
