package com.aneal.bgn.ch5;

/**
 * When a new String object is created using the new operator, the JVM allocate new
 * memory for a new object and store it in the heap, so the String pool won’t be used.
 * This results in every String object created like this having its own memory region with
 * its own address. That is why if we were to compare variable text22 and variable text23,
 * from the initial code sample, we would expect their references to be different, but the
 * objects should be equal.
 */
public class StringDemo03 {
    public static void main(String[] args) {
        String text22 = "two";
        String text23 = new String ("two");

        if (text22 == text23){
            System.out.println("Equal References");
        } else{
            System.out.println("Different References");
        }
        if (text22.equals(text23)){
            System.out.println("Equal Objects");
        } else {
            System.out.println("Different Objects");
        }
    }
}
