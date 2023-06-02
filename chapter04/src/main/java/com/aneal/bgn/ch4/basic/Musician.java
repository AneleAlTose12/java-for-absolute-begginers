//package com.aneal.bgn.ch4.basic;
//
//import java.util.List;
//
///**
// * One of the clean coding principles requires developers to avoid code redundancy.
// * This can be done by designing the classes by following two OOP principles:
// * inheritance and abstraction
// */
//public class Musician extends Human {
//    //static final int LIFESPAN = 100;
//    //private String name;
//    //private int age;
//    //private float height;
//    private String musicSchool;
//    private String genre;
//    private List<String> songs;//The song field was not used in the constructor for simplicity reasons.
//
//    // The musician constructor calls the constructor in the superclass to set the properties defined there.
//    public Musician(String name, int age, float height, String musicSchool, String genre) {
//        super(name, age, height);
//        this.musicSchool = musicSchool;
//        this.genre = genre;
//    }
//    public int getTimeToLive(){
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
//    public String getMusicSchool() {
//        return musicSchool;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public List<String> getSongs() {
//        return songs;
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
//    public void setMusicSchool(String musicSchool) {
//        this.musicSchool = musicSchool;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public void setSongs(List<String> songs) {
//        this.songs = songs;
//    }
//}
//
