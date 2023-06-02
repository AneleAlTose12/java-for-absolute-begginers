package com.aneal.bgn.ch6;

/**
 * << shift left. Given a number represented in binary, this operator
 * shifts bits to the left. Let’s look at the following piece of code.
 */
public class ShiftDemo01 {
    public static void main(String[] args) {
        byte b1 = 12; // 00001100
        byte result = (byte) (b1 << 3);
        String str = String.format("%8s", Integer.toBinaryString(result & 0xFF))
                .replace(' ', '0');
        System.out.println("result: " + result); // 01100000

    }
    /**
     * The preceding code can be written like this: b <<= 3, using the
     * composed operators, without the need to declare another variable.
     * So, the result is 12 * 23. The way that the bits shifted is shown
     */
}
