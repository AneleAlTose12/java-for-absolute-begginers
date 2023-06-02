package com.aneal.bgn.ch5;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class LambdaRunnableDemo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i){
            new Thread(
                    //Runnable implemented on the spot
                    () -> {
                        System.out.println(currentThread().getName() + " started...");
                        for (int j = 0; j < 10; ++j) {
                            try {
                                sleep(j * 10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        System.out.println(currentThread().getName() + " ended. ");
                    }).start();
        }
        /**
         * Java provides thread management classes that can create and manage threads, so
         * the developer mustn’t declare the threads explicitly. The concurrency framework is a
         * subject too advanced for this book, but if this section has made you curious, the Oracle
         * Concurrency tutorial is at https://docs.oracle.com/javase/tutorial/essential/
         * concurrency/index.html.
         */
    }
}
