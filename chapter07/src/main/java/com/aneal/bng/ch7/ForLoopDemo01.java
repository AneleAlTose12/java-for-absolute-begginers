package com.aneal.bng.ch7;

/**
 * [init_expr] is an initialization expression that sets the initial value
 * of the counter used by this loop. It ends with ; and is not mandatory,
 * as the initialization can be done outside the statement, especially if
 * we are interested in using the counter variable later in the code and
 * outside the statement.
 * The preceding code can be written like this:
 */
public class ForLoopDemo01 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        int i = 0;
        for (; i < arr.length; ++i){ // The initialisation expression has been left out because its not mandatory to use it.
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("Loop exited with index: " + i);
    }
}
