package com.aneal.bng.ch7;

/**
 * The label used in the code sample is named HERE, and it precedes the for statement
 * that is exited when the condition is fulfilled and follows the break statement. Writing
 * label names in all all-caps letters is considered a best practice in development as it
 * avoids confusing labels with variables or class named when reading the code.
 */
public class ManipulationDemo01 {
    public static final int arr[] = {5, 1, 4, 2, 3};

    public static void main(String[] args) {
        for (int i = 0; i < 2; ++i){
            HERE: for (int j = 0; j < 2; ++j){
            for (int k =0; k < 2; ++k){
                System.out.println("(i, j, k) = (" + i + "," + j + "," + k + ")");
                if (i == j && j == k){
                    break HERE;  // HERE word is new to me, i will findout about it.
                }
            }
            }
        }
    }
}
