package com.aneal.bgn.ch6;

/**
 * >>> unsigned shift right. Also called logical shift. Given a number
 * represented in binary, this operator shifts bits to the right, together
 * with the sign bit, and the remaining positions are replaced with zero.
 * This is why, the result is always a positive number. Let’s look at the
 * following piece of code.
 */
public class ShiftDemo04 {
    public static void main(String[] args) {
        byte b1 = -16; // 11110000
        byte result = (byte) (b1 >>> 3);
        String str = String.format("%8s", Integer
                .toBinaryString(result & 0xFF))
                .replace(' ', '0');
        System.out.println("result: " + result); // 00011110
    }
}
