package com.aneal.bng.ch7;
/**
 * The problem with this code is that it runs forever; if we want to give up trying after a
 * certain time, we must introduce a variable that counts the number of tries and then exits
 * the loop using a break statement.
 */

import java.util.Arrays;

public class BubbleSortDemo {
    public static final int arr[] = {5, 1, 4, 2, 3};

    public static void main(String[] args) {
    boolean swapped = true;
    while (swapped){
        swapped = false;
        for (int i = 0; i < arr.length - 1; ++i){
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
    }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
