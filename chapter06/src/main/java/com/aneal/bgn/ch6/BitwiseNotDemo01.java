package com.aneal.bgn.ch6;

public class BitwiseNotDemo01 {
    public static void main(String[] args) {
        byte b1 = 10;
        System.out.println("decimal: " + b1);
        String str = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).
                replace(' ', '0');
        System.out.println("binary: " + str);
    }
}
