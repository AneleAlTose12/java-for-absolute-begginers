package com.aneal.bng.ch7;

/**
 * In the following code sample, we print only the first three elements, even if the for loop
 * should traverse all of them. If we get to the index equal to 3, we exit the loop.
 */
public class MainpulationDemo {
    public static final int arr[] = {5, 1, 4, 2, 3};

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; ++i){
            if (i == 3){
                System.out.println("Bye bye!");
                break;
            }
            System.out.println("arr[" + i + "] = " + arr[i]); // We don't reach this point
        }
    }
}
