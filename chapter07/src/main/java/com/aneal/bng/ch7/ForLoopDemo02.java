package com.aneal.bng.ch7;

/**
 * [condition] is the termination condition of the loop, as long as this
 * condition is evaluated to true, the loop will continue executing.
 * The condition ends with ; and funny enough, it is not mandatory
 * either, as the termination condition can be placed inside the code to
 * be executed repeatedly by the loop. So, the preceding code can be
 * modified further and written like this:
 */
public class ForLoopDemo02 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        int i = 0;
        for (; ; ++i){ // The condition has been left out because its not mandatory to use it
            if (i >= arr.length){ // We put the condition here.
                break;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("Loop exited with index: " + i);
    }
}
