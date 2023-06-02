package com.aneal.bgn.ch5;

/**
 * Let’s properly initialize the array field previously declared and give it a
 * size to see what happens.
 */
public class ArraysDemo03 {
    public static void main(String[] args) {
        int[] array = new int[2];
        for(int i = 0; i < array.length; ++i){
            System.out.println("array["+ i +"]= " + array[i]);
        }
    }
}
