package com.aneal.bng.ch7;

/**
 * This type of for statement is also called as having enhanced syntax and basically
 * executes the code block for each item in the collection used in its expression. This means
 * it works on any implementation of Collection interface and it works on arrays too. So,
 * the example code is written like this:
 */
public class ForLoopDemo07 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        for (int item : arr){
            System.out.println(item);
        }
    }
}
