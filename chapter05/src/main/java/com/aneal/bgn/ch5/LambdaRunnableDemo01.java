package com.aneal.bgn.ch5;

public class LambdaRunnableDemo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i){
            new Thread(new CounterRunnable()).start();
        }
    }
}
