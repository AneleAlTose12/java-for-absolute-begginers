package com.aneal.bng.ch7;

public class ManipulationDemo03 {
    public static final int arr[] = {5, 1, 4, 2, 3};

    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i){
            HERE:
            for (int j = 0; j < 3; ++ j) {
                for (int k = 0; k < 3; ++k){
                    if (k == 1){
                        continue HERE;
                    }
                    System.out.println("(i, j, k) = (" + i + "," + j + "," + k + ")");
                }
            }
        }
    }
}
