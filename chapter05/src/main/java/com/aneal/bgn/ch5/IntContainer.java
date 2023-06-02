package com.aneal.bgn.ch5;

/**
 * Let’s introduce a class named IntContainer, whose
 * only purpose is to wrap primitive values into objects.
 * There are reference types in Java:
 * class types
 * interface types
 * enums
 * arrays types
 */
public class IntContainer {
    private int value;
    public IntContainer(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}

