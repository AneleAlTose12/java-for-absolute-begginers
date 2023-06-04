package com.aneal.bng.ch8;

import java.util.List;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<Integer> bigList = List.of(50, 10, 250, 100);

        bigList.parallelStream()
                .forEach(i ->
                        System.out.println(Thread.currentThread().getName() + ": " + i)
                );
    }
}
