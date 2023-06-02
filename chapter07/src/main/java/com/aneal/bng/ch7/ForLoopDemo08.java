package com.aneal.bng.ch7;

import java.util.List;

/**
 * Clearly the best part in this case is that we no longer need a termination condition,
 * or counter at all. Starting with Java 8, the name forEach is no longer needed for the for
 * statement with enhanced syntax, because the forEach default method was added to all
 * Collection extensions. Combine that with lambda expressions and the code to print the
 * elements of a list becomes
 */
public class ForLoopDemo08 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 4, 2, 3);
        list.forEach(item -> System.out.println(item));
        //or
        list.forEach(System.out::println); // Pay careful attention to this
    }
}
