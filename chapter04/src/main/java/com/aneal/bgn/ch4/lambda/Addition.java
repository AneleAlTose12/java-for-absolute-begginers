package com.aneal.bgn.ch4.lambda;

public class Addition implements Operation{

    @Override
    public float execute(int a, int b){
        return a + b;
    }
}
