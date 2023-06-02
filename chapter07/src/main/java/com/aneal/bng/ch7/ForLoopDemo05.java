package com.aneal.bng.ch7;

import java.util.List;

/**
 * [code_block] is a block of code executed repeatedly, in every step
 * of the loop. If there is no exit condition within this code, this block
 * of code is executed by as many times as the counter passes the
 * termination condition.
 */
public class ForLoopDemo05 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 4, 2, 3);

        for (int j = 0; j < list.size(); ++j){
            System.out.println("list[" + j + "] = " + list.get(j));
        }
    }
}
