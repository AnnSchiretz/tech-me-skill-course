package com.teachmeskill.hometask4;

public class MatrixTranspose {
    public static void main(String[] args){
        String newLine = System.getProperty("line.separator");
        int [][] myMatrix = new int [5][5];
        fillingMatrix(myMatrix);
        System.out.print(newLine);
        transpose(myMatrix);
    }
    private static void fillingMatrix(int[][] myMatrix) {
        for(int i = 0; i < myMatrix.length; i++){
            for(int j = 0; j<myMatrix.length; j ++ ){
                myMatrix[i][j] = (int) (Math.random() * 20);
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private static void transpose(int[][] myMatrix) {
        int[][] b = new int[myMatrix.length][myMatrix.length];
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[0].length; j++) {
                b[i][j] = myMatrix[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
