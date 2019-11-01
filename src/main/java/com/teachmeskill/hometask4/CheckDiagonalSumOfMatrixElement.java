package com.teachmeskill.hometask4;

public class CheckDiagonalSumOfMatrixElement {
    public static void main(String[] args) {
        int[][] myMatrix = new int[5][5];
        int sumMainDiagonal = 0;
        int sumSideDiagonal = 0;
        int sumDiagonalBelowSideEvenElements = 0;
        matrixFilling(myMatrix);
        sumMainDiagonal(myMatrix, sumMainDiagonal);
        sumSideDiagonal(myMatrix, sumSideDiagonal);
        if (sumMainDiagonal > sumSideDiagonal) {
            System.out.println(" Главная диагональ больше побочной");
        } else {
            System.out.println(" Побочная диагональ больше главной");
        }
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
               if( i == myMatrix.length - j - 2 & myMatrix[i][j]%2 ==0){
                   sumDiagonalBelowSideEvenElements += myMatrix[i][j];
               }
            }
        }
        System.out.println(sumDiagonalBelowSideEvenElements);
    }

    private static void sumSideDiagonal(int[][] myMatrix, int sumSideDiagonal) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                if (i == myMatrix.length - j - 1) {
                    sumSideDiagonal += myMatrix[i][j];
                }
            }
        }
        System.out.println(sumSideDiagonal);
    }

    private static void sumMainDiagonal(int[][] myMatrix, int sumMainDiagonal) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (i == j) {
                    sumMainDiagonal += myMatrix[i][j];
                }
            }
        }
        System.out.println(sumMainDiagonal);
    }

    private static void matrixFilling(int[][] myMatrix) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myMatrix[i][j] = (int) (Math.random() * 50);
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
