package com.teachmeskill.hometask3;

public class MaxArrayElementAndElementIndex {
    public static void main(String[] args){
        String newLine = System.getProperty("line.separator");
        int [] myArray = new int[12];
        int maxNum = 0;
        int index = 0;
        for(int i = 0; i< myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 15);
            System.out.print(myArray[i] + " ");
            for (int k = 0; k < myArray.length; k++){
                if(myArray[i]>=maxNum){
                    maxNum = myArray[i];
                    index = i;
                }
            }
        }
        System.out.println(newLine);
        System.out.print(maxNum);
        System.out.println(newLine);
        System.out.print(index);
    }
}
