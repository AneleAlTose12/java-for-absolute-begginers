package com.aneal.bgn.ch5;

import java.util.HashMap;
import java.util.Map;

/**
 * Map implementations come with a few differences because they model collections of
 * key-value pairs; so this case is treated separately. The following code snippet depicts the
 * creation, initialization of a map that uses keys of type String and values of type Integer.
 * The syntax is Java 6.
 */
public class CollectionsDemo07 {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new HashMap<String, Integer>();
        stringMap.put("one", 1);
        stringMap.put("two", 2);
        stringMap.put("three", 3);

        for (Map.Entry<String, Integer> entry : stringMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
