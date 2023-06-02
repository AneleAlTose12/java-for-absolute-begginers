package com.aneal.bgn.ch5;

public class ThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i){
            new CounterThread01().start();
        }
    }
}
