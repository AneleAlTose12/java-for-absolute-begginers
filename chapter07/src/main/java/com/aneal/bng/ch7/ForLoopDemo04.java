package com.aneal.bng.ch7;

/**
 * The modification of the counter does not have to be done inside
 * the code; it can be done in the termination condition, but the
 * initialization expression and the termination condition must be
 * modified accordingly to fit the purpose. The code depicted next
 * has the same effect as all the samples before it.
 */
public class ForLoopDemo04 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        for (int i = -1; i++ < arr.length -1;){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        //System.out.println("Loop exited with index: " + i);
    }
}
