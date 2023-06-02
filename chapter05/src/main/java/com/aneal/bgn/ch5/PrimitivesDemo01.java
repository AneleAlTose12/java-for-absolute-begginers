package com.aneal.bgn.ch5;

import java.util.Date;

/**
 * Let’s consider the following executable class, and imagine how the memory is
 * organized during the execution of this program.
 */
public class PrimitivesDemo01 {
    public static void main(String[] args) {
        int i = 5; // Primitive local variables
        int j = 7; // Primitive local variables
        Date d = new Date();   // Heap memory and reference named d is saved.
        int result = add(i, j);  // Method add() is called with arguments i and j.
        System.out.println(result);
        d = null;
    }
    static int add(int a, int b){  // Inside add() method strings a and b are declared.
        String mess = new String("performing add ...");
        return a + b;
    }
}
