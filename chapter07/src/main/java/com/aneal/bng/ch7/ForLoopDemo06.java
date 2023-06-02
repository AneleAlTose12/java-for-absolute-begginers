package com.aneal.bng.ch7;

import java.util.List;

/**
 * The code seems somehow impractical and that is why List<> instances can be
 * traversed with a different type of for statement that was known as forEach until Java 8.
 * You will see immediately why, but first let’s look at forEach.
 */
public class ForLoopDemo06 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 4, 2, 3 );

        for (Integer item: list){
            System.out.println(item);
        }
    }
}
