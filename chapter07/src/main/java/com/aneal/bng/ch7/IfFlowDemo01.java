package com.aneal.bng.ch7;

/**
 * This if the (if statement doesn't have the else part)
 */
public class IfFlowDemo01 {
    public static void main(String[] args) {
        //Read
        int a = Integer.parseInt(args[0]);

        if(a < 0){
            System.out.println("Negative");
        }
    }
}
