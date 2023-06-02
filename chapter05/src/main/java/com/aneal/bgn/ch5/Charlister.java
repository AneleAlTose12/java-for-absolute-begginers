package com.aneal.bgn.ch5;

/**
 *The following code snippet, prints all the numeric values of the char interval and their
 * matching characters.
 */
public class Charlister {
    public static void main(String[] args) {
        for(int i = 0; i < 65536; ++i ){
            char c = (char) i;
            System.out.println("c["+ i +"]=" + c);
        }
    }
}