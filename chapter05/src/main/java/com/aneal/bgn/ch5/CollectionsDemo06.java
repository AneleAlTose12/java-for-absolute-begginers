package com.aneal.bgn.ch5;

import java.util.List;

/**
 * The resulting List<T> is an immutable collection; it can no longer be modified, and
 * elements cannot be added or removed from it.
 * Moving closer to the present, in Java 10, support for local variable type inference
 * was added, which means that we no longer have to explicitly specify the reference
 * type, because it is automatically be inferred based on the object type, so the following
 * declaration
 * List<String> stringList = List.of("one", "two", "three");
 * becomes
 */
public class CollectionsDemo06 {
    public static void main(String[] args) {
        var stringList = List.of("one", "two", "three");
    }
}
