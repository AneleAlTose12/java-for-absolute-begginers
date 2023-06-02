package com.aneal.bng.ch7;

public class ReturnDemo {
    public static final int arr[] = {5, 1, 4, 2, 3};

    public static void main(String[] args) {
        int foundIdx = findEven(arr);
        if (foundIdx != -1){
            System.out.println("First even is at: " + foundIdx);
        }
    }
    public static int findEven(int ... arr){
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] % 2 == 0){
                return i;
            }
        }
        return -1;
    }
}
