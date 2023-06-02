package com.aneal.bgn.ch4.lambda;

public class OperationDemo {
    public static void main(String[] args) {
        Addition addition = new Addition();
        float result = addition.execute(2,5);
        System.out.println("Result is " + result);
    }
}
