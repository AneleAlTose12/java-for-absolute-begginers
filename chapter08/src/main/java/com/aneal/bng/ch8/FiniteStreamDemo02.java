package com.aneal.bng.ch8;
/**
 * The takeWhile(..) operation is the "sister" of the dropWhile(..); and does exactly
 * the reverse of what takeWhile(..) does: it returns, for an ordered stream, a stream
 * consisting elements after dropping the longest set of elements that match the predicate.
 * So in the following example, we expect the following elements to be printed in the
 * console: 11 12 13 15
 */

import java.util.stream.Stream;

public class FiniteStreamDemo02 {
    public static void main(String[] args) {
        Stream<Integer> forDropping = Stream.of(3, 6, 9, 11, 12, 13, 15);
        forDropping.dropWhile(s -> s % 3 == 0)
                .forEach(s -> System.out.println(s + " "));
    }
}
