package com.aneal.bgn.ch5;

/**
 * When passed as arguments to other methods, the values of primitive values are copied
 * and used without the initial variables being modified. This can be proved by creating a
 * method to swap the values of two int variables. The following is the code for the method.
 */
public class PrimitivesDemo03 {
    public static void main(String[] args) {
        int k = 42;
        int q = 44;

        swap(k, q);

        System.out.println("k = " + k);
        System.out.println("q = " + q);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
