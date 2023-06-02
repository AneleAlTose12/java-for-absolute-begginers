package com.aneal.bgn.ch5;

/**
 * Let’s declare a
 * few arrays to show you how versatile and useful they are. Let’s declare first an array field
 * and check what is happening with it when an object is created.
 */
public class ArraysDemo01 {
    int array[];

    public static void main(String[] args) {
        ArraysDemo01 ad = new ArraysDemo01();
        System.out.println("array was initialized with " + ad.array);
    }
}
