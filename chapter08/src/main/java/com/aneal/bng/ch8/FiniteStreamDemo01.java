package com.aneal.bng.ch8;
/**
 * In Java 9 aside from limit() there is another way to control the numbers of values in
 * a stream: the takeWhile(..) operation. This method takes the longest set of elements
 * from the original stream that matches the predicate received as argument, starting with
 * the first element. This works fine for ordered streams, but if the stream is unordered the
 * result is, any set of elements that match the predicate, including an empty one. Let’s
 * see it in action! The first code sample uses takeWhile(..) on a stream of integers and
 * returns a stream with elements that divide by 3.
 */

import java.util.stream.Stream;

public class FiniteStreamDemo01 {
    public static void main(String[] args) {
        Stream<Integer> forTaking = Stream.of(3, 6, 9, 11, 12, 13, 15);
        forTaking.takeWhile(s -> s % 3 == 0)
                .forEach(s -> System.out.println(s + " "));
    }
}
