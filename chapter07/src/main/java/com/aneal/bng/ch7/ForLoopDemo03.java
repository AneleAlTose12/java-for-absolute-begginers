package com.aneal.bng.ch7;

/**
 * [step] is the step expression or increment that increases the counter
 * on every step of the loop. It should end in ;, but it is often dropped,
 * and as you probably already expected, it is not mandatory either, as
 * nothing stops the developer from manipulating the counter inside
 * the code block. So, the preceding code can also be written like this:
 */
public class ForLoopDemo03 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        int i = 0;
        for (; ;){ // The step part is also not mandatory
            if (i >= arr.length){
                break;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
            ++i; // We can put the step part here
        }
        System.out.println("Loop exited with index: " + i);
    }
}
