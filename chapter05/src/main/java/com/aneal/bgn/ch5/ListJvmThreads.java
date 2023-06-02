package com.aneal.bgn.ch5;

/**
 * These threads can easily be accessed using static utility methods defined in
 * the java.lang.Thread class. The following code sample does just that: extracts the
 * references to the Thread instances and prints their name in the console.
 */
public class ListJvmThreads {
    public static void main(String[] args) {
        var threadSet = Thread.getAllStackTraces().keySet();
        var threadArray = threadSet.toArray(new Thread[threadSet.size()]);

        for (int i = 0; i < threadArray.length; ++i){
            System.out.println("thread name: " + threadArray[i].getName());
        }
    }
}
