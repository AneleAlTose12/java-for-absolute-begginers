package com.aneal.bng.ch7;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        int i = 0;
        while (i < arr.length){
            System.out.println("arr[" + i + "] = " + arr[i]);
            ++i;
        }
    }
}
