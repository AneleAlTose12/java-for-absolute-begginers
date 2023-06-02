package com.aneal.bgn.ch5;

/**
 * To really exchange the values, we need to exchange the
 * content of the objects by using a new object. Look at the following new version of the
 * swap(..) method.
 */
public class PrimitivesDemo05 {
    public static void main(String[] args) {
        IntContainer k = new IntContainer(42);
        IntContainer q = new IntContainer(44);

        swap(k,q);
        System.out.println("k = " + k.getValue());
        System.out.println("q = " + q.getValue());
    }
    static void swap(IntContainer a, IntContainer b){ // Modified swap() method
        IntContainer temp = new IntContainer(a.getValue());
        a.setValue(b.getValue());
        b.setValue(temp.getValue());
    }
}
