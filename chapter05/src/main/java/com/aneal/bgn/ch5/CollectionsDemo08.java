package com.aneal.bgn.ch5;
/**
 * In Java 1.8, traversal and printing values in maps became more practical.
 */

import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo08 {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.forEach((k,v) -> System.out.println(k + ": " + v));
        stringMap.put("one", 1);
        stringMap.put("two", 2);
        stringMap.put("three", 3);

        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
