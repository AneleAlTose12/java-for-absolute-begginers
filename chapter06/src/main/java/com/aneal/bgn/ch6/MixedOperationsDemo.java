package com.aneal.bgn.ch6;

public class MixedOperationsDemo {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;

        float f = 5;
        double d = 6;
        int ii = 6;

        double resd = l + d;
        long resl = s + 3;
        //etc

        if (b <= s){
            System.out.println("byte val < short val");
        }
        if (i >= b){
            System.out.println("int val >= byte val");
        }
        if (l > b){
            System.out.println("long val > byte val");
        }
        if (d > i){
            System.out.println("double val > byte val");
        }
        if (i == i){
            System.out.println("double val == int val");
        }
    }
}
