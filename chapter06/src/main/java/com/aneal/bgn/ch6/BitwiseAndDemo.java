package com.aneal.bgn.ch6;

/**
 * The bitwise AND operator is represented by & and what is does is to compare two
 * numbers bit by bit and if the bits on each position have the value of 1, the bit in the result
 * is 1. The following code sample, depicts the result of the & operator.
 */
public class BitwiseAndDemo {
    public static void main(String[] args) {
        byte b1 = 117; // 01110101
        byte b2 = 95; // 01011111

        byte result = (byte) (b1 & b2); // 01010101
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("---------");
        String str = String.format("%8s", Integer.toBinaryString(result & 0xFF))
                .replace(' ', '0');
        System.out.println("result: " + result);
        System.out.println("binary result: " + str);
    }
}
