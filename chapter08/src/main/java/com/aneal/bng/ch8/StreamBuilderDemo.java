package com.aneal.bng.ch8;
/**
 * So, if we want to generate a stream of integers, a proper implementation for get()
 * should return a random integer. The expanded code is depicted next; no lambda
 * expressions are used to make it clear that the get(..) receives as a parameter a
 * Supplier<Integer> instance created on the spot.
 */

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamBuilderDemo {
    public static void main(String[] args) {
        Stream<Integer> generated = Stream.generate(
                new Supplier<Integer>(){
                    @Override
                    public Integer get(){
                        Random rand = new Random();
                        return rand.nextInt(300) + 1;
                    }
                }
        ).limit(15);
    }
}
