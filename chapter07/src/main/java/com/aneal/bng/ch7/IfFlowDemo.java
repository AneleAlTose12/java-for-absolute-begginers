package com.aneal.bng.ch7;

public class IfFlowDemo {
    public static void main(String[] args) {
        //Read a
        int a = Integer.parseInt(args[0]);

        if(a % 2 == 0){ // is even
            //Display EVEN
            System.out.println("EVEN");
        } else {
            //Display ODD
            System.out.println("ODD");
        }
    }
}
