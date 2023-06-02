package com.aneal.bgn.ch6;

public class DecimalPointDemo {
    public static void main(String[] args) {
        float f1 = 2.2f;
        float f2 = 2.0f;
        float f3 = f1 * f2;

        if (f3 == 4.4){
            System.out.println("expected float value of 4.4");
        } else {
            System.out.println("unexpected value of " + f3);
        }
    }
}
