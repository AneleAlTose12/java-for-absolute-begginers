package com.aneal.bng.ch8;
/**
 * ! For practical reasons, there is no need to call stream()for collections when
 * a sequential stream is needed only for traversal, because the forEach method
 * defined for them does the job well. So the preceding code can be reduced to
 */

import java.util.List;

public class StreamDemo02 {
    public static void main(String[] args) {
        List<Integer> biglist = List.of(50, 10, 250, 100);

        biglist.forEach(i ->
                System.out.println(Thread.currentThread().getName() + ": " + i)
        );
    }
}
