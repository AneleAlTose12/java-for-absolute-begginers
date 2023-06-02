package com.aneal.bgn.ch3.helloworld;
/**
 * HelloWorld.java
 * This is the first java class i created on the chapter 3 of this book
 * Author: Anele Aneal Tose
 * Date: 17 - March - 2023
 */

import java.util.List;
import java.util.function.Consumer;

public class HelloWorld {
    public static void main(String[] args) {
//        List<String> items = List.of("1", "a", "2", "a", "3", "a");
//        items.forEach(item -> {
//            if (item.equals("a")) {
//                System.out.println("A");
//            } else{
//                System.out.println("Not A");
//            }
//        });

//        List<String> items = List.of("1", "a", "2", "a", "3", "a");
//        items.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String item) {
//                if (item.equals("a")) {
//                    System.out.println("A");
//                } else {
//                    System.out.println("Not A");
//                }
//            }
//        });
        // BASE RULES OF WRITING JAVA CODE
        List<String> items = List.of("1", "a", "2", "a", "3", "a");
        items.forEach(item -> {
            if (item.equals("a")) {
                System.out.println("A");
            } else {
                System.out.println("Not A");
            }
        });
    }
}
