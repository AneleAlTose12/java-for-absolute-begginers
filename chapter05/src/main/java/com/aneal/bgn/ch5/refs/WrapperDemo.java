package com.aneal.bgn.ch5.refs;

public class WrapperDemo {
    public static void main(String[] args) {
        // upper interval boundary for int
        Integer max = Integer.MAX_VALUE;
        System.out.println(max);

        // unboxing
        int pmax = max;

        // boxing
        Integer io = 10;

        // creating primitive utility method
        // exception is thrown, if string is not a number
        int i1 = Integer.parseInt("11");

        // constructor deprecated in Java 9
        // exception is thrown, if string is not a number
        Integer i2 = new Integer("12");

        // exception is thrown, if string is not a number
        Integer i3 = Integer.valueOf("12");

        // convert int into to String
        String s0 = Integer.toString(13);

        // convert int to float
        float f0 = Integer.valueOf(14).floatValue();

        // creating string with binary representation of number 9 (1001)
        String s1 = Integer.toBinaryString(9);

        // introduced in Java 1.8
        Integer i4 = Integer.parseUnsignedInt("+15");

        // method to add to integers
        int sum = Integer.sum(2, 3);

        // method to get the bigger value
        int maximum = Integer.max(2, 7);
    }
}
