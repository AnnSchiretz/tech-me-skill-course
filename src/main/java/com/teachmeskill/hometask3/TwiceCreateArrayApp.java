package com.teachmeskill.hometask3;

import java.util.Arrays;

public class TwiceCreateArrayApp {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        int[] myArray = getFilledArray();
        int[] mySecondArray = getFilledArray();
        int sumFirstArray = Arrays.stream(myArray).sum();
        int sumSecondArray = Arrays.stream(mySecondArray).sum();
        double averageValue = getAverageValue(myArray, sumFirstArray);
        double secondAverageValue = getAverageValue(mySecondArray, sumSecondArray);

        System.out.print(newLine);
        System.out.print(sumFirstArray);
        System.out.print(newLine);
        System.out.print(averageValue);
        System.out.println(newLine);
        System.out.print(sumSecondArray);
        System.out.print(newLine);
        System.out.print(secondAverageValue);
        System.out.print(newLine);

        if (sumFirstArray > sumSecondArray){
            System.out.println("среднеарифметическое первого массива больше, чем второго");
        } else if(sumFirstArray < sumSecondArray) {
            System.out.println("среднеарифметическое значение второго массива больше, чем первого");
        } else {
            System.out.println("возможно, они равны");
        }
    }

    private static double getAverageValue(int[] array, int sum) {
        double averageValue = 0;

        for (int i = 0; i < array.length; i++) {
            averageValue = sum / array.length;
        }
        return averageValue;
    }

    private static int[] getFilledArray() {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
