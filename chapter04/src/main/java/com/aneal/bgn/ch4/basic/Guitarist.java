package com.aneal.bgn.ch4.basic;

import com.aneal.bgn.ch4.hierarchy.Gender;
import com.aneal.bgn.ch4.hierarchy.Human;
import com.aneal.bgn.ch4.hierarchy.Musician;

import java.util.List;

public class Guitarist extends Human implements Musician{
    private String musicSchool;
    private String genre;
    private List<String> songs;//The song field was not used in the constructor for simplicity reasons.

    public Guitarist(String name, int age, Gender gender, String musicSchool, String genre) {
        super(name, age, gender);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }

    public Guitarist(String name, int age, float height, Gender gender, String musicSchool, String genre) {
        super(name, age, height, gender);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }
    public int getTimeToLive(){
        return (LIFESPAN - getAge()) / 2;
    }

    public String getMusicSchool() {
        return musicSchool;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String getMusicSchool(String musicSchool) {
        return null;
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    public void setMusicSchool(String musicSchool) {
        this.musicSchool = musicSchool;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public String getSchool() {
        return null;
    }

    @Override
    public void setSchool(String school) {

    }
}
