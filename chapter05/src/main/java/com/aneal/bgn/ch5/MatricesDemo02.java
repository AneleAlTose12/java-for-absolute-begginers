package com.aneal.bgn.ch5;

/**
 * But you can get multidimensional and define as many coordinates as you want. The
 * next code snippet defines only three of them.
 */
public class MatricesDemo02 {
    public static void main(String[] args) {
        // cubical matrix, with three coordinates
        int [][][] intMatrix3 = new int[2][2][2];
        for (int i = 0; i < intMatrix3.length; ++i){
            for (int j = 0; j < intMatrix3[i].length; ++j){
                for (int k = 0; k < intMatrix3[i][j].length; ++k){
                    intMatrix3[i][j][k] = i + j + k;
                    System.out.println("["+ i +", "+ j +", "+ k +"]");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
