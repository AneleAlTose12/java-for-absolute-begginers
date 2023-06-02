package com.aneal.bgn.ch6;

public class BitwiseInclusiveOrDemo01 {
    public static void main(String[] args) {
        byte b1 = 117; // 01110101
        byte b2 = 95; // 010111111

        byte result = (byte) (b1 | b2); // 01111111

        System.out.println("b1: "+ b1);
        System.out.println("b2: "+ b2);
        System.out.println("--------");
        String str = String.format("%8s", Integer.toBinaryString(result & 0xFF))
                .replace(' ', '0');
        System.out.println("result: " + result);
        System.out.println("binary result: " + str);
    }
}
