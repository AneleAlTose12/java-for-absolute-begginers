package com.aneal.bgn.ch4.hierarchy;
/**
 * Human.java;
 * This is a concrete class
 * @author Anele Aneal Tose
 * @date 18/03/2023
 */

import com.aneal.bgn.ch4.hierarchy.Gender;

/**
 * A class that does not need to be instantiated, but groups together fields and methods
 * for other classes to inherit, or provide a concrete implementation for is modelled in Java by
 * an abstract class.
 */
public abstract class Human {
    // Declaring a static OR class variable below
    public static final int LIFESPAN = 100;
    // Declaring field variables for this class
    protected String name;
    protected int age;
    protected float height;
    protected String actingSchool;
    private Gender gender; // Because gender is an object

    // Second constructor for calling name and age
    public Human(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Human(String name, int age, float height, Gender gender){
        this(name,age,gender);  // So, let’s fix that by using the this keyword.
        this.height = height;
    }

    /**
     * compute and prints time to live
     */
//    public void computeAndPrintTtl(){
//        int ttl = LIFESPAN - this.age;
//        System.out.println("Time to live: " + ttl);
//    }
    /**
     * @return time to live
     */
    // This method doesn't have parameters, so it is called without providing an arguments
//    public abstract int getTimeToLive(){
//        int ttl = LIFESPAN - this.age;
//        return ttl;
//    }
    // Getters and Setters
    // Declare an abstract method
    public abstract int getTimeToLive();
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }

}
