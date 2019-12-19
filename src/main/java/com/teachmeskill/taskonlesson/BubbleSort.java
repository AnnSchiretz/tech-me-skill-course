package com.teachmeskill.taskonlesson;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int [] myArray = {2,4,6,73,99};
        boolean isSorting = false;
        while(!isSorting){
            isSorting = true;
            for (int i = 0; i < myArray.length - 1; i++){
                if(myArray[i] > myArray[i + 1]){
                    int temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                    isSorting = false;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
