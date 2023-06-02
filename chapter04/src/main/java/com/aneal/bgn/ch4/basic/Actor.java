//package com.aneal.bgn.ch4.basic;
//
//import java.util.List;
///**
// * One of the clean coding principles requires developers to avoid code redundancy.
// * This can be done by designing the classes by following two OOP principles:
// * inheritance and abstraction
// */
//public class Actor extends Human {
//    //static final int LIFESPAN = 100;
//    //private String name;
//    //private int age;
//    //private float height;
//    private String actingSchool;
//    private List<String> films;
//
//    public Actor(String name, int age, float height, String actingSchool) {
//        super(name, age, height);
//        this.actingSchool = actingSchool;
//    }
//    public int getTimeToLive() {
//        return (LIFESPAN - getAge()) / 2;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public String getActingSchool() {
//        return actingSchool;
//    }
//
//    public List<String> getFilms() {
//        return films;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setHeight(float height) {
//        this.height = height;
//    }
//
//    public void setActingSchool(String actingSchool) {
//        this.actingSchool = actingSchool;
//    }
//
//    public void setFilms(List<String> films) {
//        this.films = films;
//    }
//}
