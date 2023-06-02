package com.aneal.bgn.ch5;

/**
 * Objects are handled in Java using references to them. The == operator compares
 * references; but if we want to compare the objects, we must use the equals() method.
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String text21 = "two";
        String text22 = "two";

        if (text21 == text22){
            System.out.println("Equal References");
        } else{
            System.out.println("Different References");
        }
        if (text21.equals(text22)){
            System.out.println("Equal Objects");
        } else {
            System.out.println("Different Objects");
        }
    }
}
