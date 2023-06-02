package com.aneal.bgn.ch6;

/**
 * The preceding code can be written like this: b >>= 3, using
 * the composed operators, without the need to declare another
 * variable.
 */
public class ShiftDemo03 {
    public static void main(String[] args) {
        byte b1 = 96; // 01100000
        byte result = (byte) (b1 >>= 3);
        String str = String.format("%8s", Integer
                .toBinaryString(result & 0xFF))
                .replace(' ', '0');
        System.out.println("result: " + result); // 00001100
    }
}
