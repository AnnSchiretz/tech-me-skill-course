package com.teachmeskill.hometask3;

public class AscendingArrayOrNotApp {
    public static void main(String[] args) {
        int [] myArray = new int [4];
        boolean flag = true;
        for (int i = 0 ; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 10);
            System.out.println(myArray[i]);
        }
        for (int i = 1; i < myArray.length; i++) {
            if(myArray[i]<=myArray[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("массив является строго возрастающей последовательностью");
        } else {
            System.out.println("массив не является строго возрастающей последовательностью");
        }
    }
}
