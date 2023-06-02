package com.aneal.bgn.ch6;

public class ComparisonOperatorsDemo {
    public static void main(String[] args) {
        int[] values = {1, 7, 9, 2, 6,};

        for (int i = 0; i < values.length; ++i){
            if(values[i] == 2){ //(*)
                System.out.println("Fount 2 at index: " + i);
            }
        }
    }
}
