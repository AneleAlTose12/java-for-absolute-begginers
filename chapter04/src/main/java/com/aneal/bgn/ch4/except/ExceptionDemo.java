package com.aneal.bgn.ch4.except;

import com.aneal.bgn.ch4.hierarchy.Performer;

public class ExceptionDemo {
    // bad method
//    static int rec(int i){
//        return rec(i*i);
//    }
    public static void main(String[] args) {
//        try {     // implement a try - catch
//            rec(1000);
//        } catch (Throwable r){
//
//        }
//        System.out.println("An error happened.");
        try {
            Performer p = PerformerGenerator.get("John");
            System.out.println("TTL: " + p.getTimeToLive());
        } catch (EmptyPerformerException epe){
            System.out.println("Cannot use an empty performer! ");
        } finally {
            System.out.println("All went as expected!");
        }
    }
}
