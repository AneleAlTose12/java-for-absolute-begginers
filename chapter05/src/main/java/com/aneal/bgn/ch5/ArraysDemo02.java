package com.aneal.bgn.ch5;

/**
 * This is why
 * developers test equality to null before using the object (or array). Let’s modify the
 * previous example to do that.
 */
public class ArraysDemo02 {
    int array[];

    public static void main(String[] args) {
        ArraysDemo02 ad = new ArraysDemo02();
        if (ad.array == null){
            System.out.println("array unusable");
        }
    }
}
