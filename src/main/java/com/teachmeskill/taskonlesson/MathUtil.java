package com.teachmeskill.taskonlesson;

import java.util.Arrays;

public class MathUtil {

    public static double [] sort (double [] array){
        Arrays.sort(array);
        return array;
    }
    public static double [] roundArray(double[] array){
        for(int i = 0; i<array.length; i++){
            array[i] =(double) Math.round(array[i]);
        }
        return array;
    }
}
