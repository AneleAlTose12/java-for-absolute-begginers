package com.aneal.bgn.ch5;

public class StringDemo01 {
    public static void main(String[] args) {
        String text1 = null;

        String text21 = "two";
        String text22 = "two";
        String text23 = new String("two");

        String piece1 = "t";
        String piece2 = "wo";
        String text24 = piece1 + piece2;

        char[] twoCh = {'t', 'w', 'o'};
        String text25 = new String(twoCh);
    }
}
