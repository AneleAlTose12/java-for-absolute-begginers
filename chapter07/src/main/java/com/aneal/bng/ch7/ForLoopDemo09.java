package com.aneal.bng.ch7;

import java.util.Arrays;

/**
 * Pretty neat, ha? But wait, there’s more, it works on arrays too, but a small conversion
 * to suitable implementation BaseStream is necessary first. But it is provided by the Arrays
 * utility class that was enriched in Java 8 with methods to support lambda expressions. So
 * yeah, the code with the arr array can be written (starting in Java) 8 like this:
 */
public class ForLoopDemo09 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        Arrays.stream(arr).forEach(System.out::println);
    }
    /**
     * In Java 11, all the preceding examples compile and execute just fine, so use whatever
     * syntax you prefer most when writing your solutions.
     */
}
