package com.aneal.bng.ch7;

public class ReturnDemo01 {
    public static final int arr[] = {5, 1, 4, 2, 3};

    public static void main(String[] args) {
        int foundIdx = findEven(arr);
            if (foundIdx != -1){
                System.out.println("First even is at: " + foundIdx);
            }
        }
        public static int findEven(int ... arr){
            int i = 0;
            while (i < arr.length){
                if (arr[i] % 2 == 0){
                    return i;
                }
                ++i;
            }
            return -1;
        }
    }
