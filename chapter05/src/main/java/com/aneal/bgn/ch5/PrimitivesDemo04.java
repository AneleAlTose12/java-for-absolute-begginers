package com.aneal.bgn.ch5;

/**
 * And now we create two objects of this type and two references for them and rewrite
 * the swap method.
 */
public class PrimitivesDemo04 {
    public static void main(String[] args) {
        IntContainer k = new IntContainer(42);
        IntContainer q = new IntContainer(44);

        swap(k,q);
        System.out.println("k = " + k.getValue());
        System.out.println("q = " + q.getValue());
    }
    static void swap(IntContainer a, IntContainer b){
        IntContainer temp = a;
        a = b;
        b = temp;
    }
}
