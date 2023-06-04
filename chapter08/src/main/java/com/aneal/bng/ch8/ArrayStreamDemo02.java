package com.aneal.bng.ch8;

import java.util.Arrays;

/**
 * The novelty with arrays is that a stream can be created form a part of the array by
 * specifying the start and the end indexes for the array chunk.
 */
public class ArrayStreamDemo02 {
    public static void main(String[] args) {
        int[] arr = {50, 10, 250, 100};

        Arrays.stream(arr, 3, 6).forEach( // start and end indexes
                i -> System.out.println(Thread.currentThread().getName() + ": " + i)
        );
    }
}
