package com.aneal.bgn.ch5;
/**
 * In Java 9, yet another improvement was introduced: factory methods for collections.
 * Our collection was populated with elements by repeatedly calling add(..), which is a
 * little redundant, especially since we have the full collection of elements we want to put in
 * the list. That is why in Java 9 methods to create collection objects in one line of code were
 * introduced; for example,
 */
import java.util.List;

public class CollectionsDemo05 {
    public static void main(String[] args) {
        List<String> stringList = List.of("one", "two", "three");
    }
}
