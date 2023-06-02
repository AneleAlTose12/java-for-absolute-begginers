package com.aneal.bng.ch7;

/**
 * The continue statement does not break a loop, but can be used to skip certain steps
 * based on a condition. So it basically, stops the current step of the loop and moves to
 * the next one, so you could say that this statement continues the loop. Let’s continue
 * experimenting with the array traversal example, and this time, let’s skip from printing the
 * elements with odd indexes by using the continue statement.
 */
public class ManipulationDemo02 {
    public static final int arr[] = {5, 1, 4, 2, 3};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; ++i){
            if (i % 2 != 0){
                continue;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
