package com.teachmeskill.taskonlesson;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        double[] arr = {4.77,34.6,2.4,48.99};

        System.out.println(Arrays.toString(MathUtil.sort(arr)));
        System.out.println(Arrays.toString(MathUtil.roundArray(arr)));
    }
}
