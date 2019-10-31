package com.teachmeskill.hometask4;

public class RandomMatrixApp {
    public static void main(String[] args) {
        int[][] myMatrix = new int[5][5];
        int sumMatrixMainDiagonal = 0;
        matrixFilling(myMatrix);
        matrixDiagonalAmount(myMatrix, sumMatrixMainDiagonal);
        oddElements(myMatrix);
    }

    private static void oddElements(int[][] myMatrix) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (i == j) {
                    if (myMatrix[i][j] % 2 != 0) {
                        System.out.print(myMatrix[i][j] + " ");
                    }
                }
            }
        }
    }

    private static void matrixDiagonalAmount(int[][] myMatrix, int sumMatrixMainDiagonal) {
        for (int i = 0; i < myMatrix.length; ++i) {
            for (int j = 0; j < myMatrix[i].length; ++j) {
                if (i == j) {
                    sumMatrixMainDiagonal += myMatrix[i][j];
                }
            }
        }
        System.out.println(sumMatrixMainDiagonal);
    }

    private static void matrixFilling(int[][] myMatrix) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[0].length; j++) {
                myMatrix[i][j] = (int) (Math.random() * 50);
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
