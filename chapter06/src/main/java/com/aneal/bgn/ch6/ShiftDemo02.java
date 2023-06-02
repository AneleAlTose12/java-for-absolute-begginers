package com.aneal.bgn.ch6;

/**
 * >> shift right. Given a number represented in binary, this operator
 * shifts bits to the right. Let’s look at the following piece of code.
 */
public class ShiftDemo02 {
    public static void main(String[] args) {
        byte b1 = 96;
        byte result = (byte) (b1 >> 3);
        String str = String.format("%8s", Integer.toBinaryString(result & 0xFF))
                .replace(' ', '0');
        System.out.println("result: " + result); // 00001100
    }
    /**
     * When bits are shifted to the right, the remaining positions are
     * filled with 0 if the number is positive. If the number is negative,
     * the remaining positions are replaced with 1. This is done to
     * preserve the sign of the number. Also, the number becomes
     * smaller, and the new value is its old value divided by −2N, where N
     * is the second operand. When the preceding code is executed, the
     * following output is printed in the console.
     */
}
