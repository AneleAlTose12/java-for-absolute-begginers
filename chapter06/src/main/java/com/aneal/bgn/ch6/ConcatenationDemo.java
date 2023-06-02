package com.aneal.bgn.ch6;

public class ConcatenationDemo {
    public static void main(String[] args) {
        int i1 = 0;
        int i2 = 1;
        int i3 = 2;

        System.out.println(i1 + i2 + i3);
        System.out.println("Result1 = " + (i1 + i2) + i3);
        System.out.println("Result2 = " + i1 + i2 + i3);
        System.out.println("Result3 = " + (i1 + i2 + i3));
    }
}
