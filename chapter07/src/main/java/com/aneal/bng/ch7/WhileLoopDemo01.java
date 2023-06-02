package com.aneal.bng.ch7;
/**
 *
 */

public class WhileLoopDemo01 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        int i = 0;
        while (true){
            if (i >= arr.length){
                break;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
