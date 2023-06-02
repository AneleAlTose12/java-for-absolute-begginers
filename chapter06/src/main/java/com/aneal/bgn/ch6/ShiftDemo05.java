package com.aneal.bgn.ch6;

/**
 * The preceding code can be written like this: b >>>= 3, using the
 * composed operators, without the need to declare another variable.
 * And the way that the bits shifted is displayed in Figure 6-8.
 */
public class ShiftDemo05 {
    public static void main(String[] args) {
        byte b1 = -16; // 11110000
        byte result = (byte) (b1 >>>= 3);
        String str = String.format("%8s", Integer
                .toBinaryString(result & 0xFF))
                .replace(' ', '0');
        System.out.println("result: " + result); // 00011110
    }
}
