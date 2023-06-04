package com.aneal.bng.ch8;
/**
 * This method is called for each element in the stream, and the T is the type of the
 * elements in the stream. The implementing class is basically declared inline by only
 * mentioning the body of the method. The JVM does the rest, because of the magic of
 * lambda expressions. Without them, you would have to write something like this:
 */

import java.util.List;
import java.util.function.Consumer;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<Integer> bigList = List.of(50, 10, 250, 100);

        bigList.stream()
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(Thread.currentThread().getName() + ": " + integer);
                    }
                });
    }
}
/**
 * Actually, this was the way you would write code before lambda expressions were
 * introduced in Java 8. If you needed to create a single object of a class type implementing
 * a specific interface, in a singular place in the application, you could choose to write a
 * contraption like that, which looks like you are instantiating the interface; the result of that
 * code is called an anonymous class. Lambda expressions simplified this process a lot, but
 * only for a category of interfaces named functional interfaces, which define a single method
 * and are annotated with the @FunctionalInterface annotation (starting in Java 8).
 */
