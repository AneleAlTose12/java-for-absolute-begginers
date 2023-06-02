package com.aneal.bgn.ch6;

public class BitwiseNotDemo02 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = (byte) ~ b1;
        System.out.println("decimal: " + b2);
        String str2 = String.format("%8s", Integer.toBinaryString(b2 & 0xFF))
                .replace(' ', '0');
        System.out.println("binary: " + str2);
    }
}
