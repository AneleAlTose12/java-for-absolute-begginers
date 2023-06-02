package com.aneal.bgn.ch5;

/**
 * if we declare two primitive variables
 * of type int, as in the following code listing, we end up with two variables, k and q, both
 * having the same value: 42.
 */
public class PrimitivesDemo02 {
    public static void main(String[] args) {
        int k = 42;
        int q = k;

        System.out.println("k = " + k);
        System.out.println("q = " + q);
    }
}
