package com.aneal.bng.ch8;

import java.util.Arrays;

public class ArrayStreamDemo {
    public static void main(String[] args) {
        int[] arr = {50, 10, 250, 100};

        Arrays.stream(arr).forEach(
                i -> System.out.println(Thread.currentThread().getName() + ": " + i)
        );
    }
}
