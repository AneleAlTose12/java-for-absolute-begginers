package com.aneal.bgn.ch4.hierarchy;

import java.util.List;

public class Performer extends Human implements Musician, Actor{
    private String school;
    private String genre;
    private List<String> songs;
    private List<String> films;

    public Performer(String name, int age, float height, Gender gender,
                     String genre) {
        super(name, age, height, gender);
    }

    @Override
    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
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
    @Override
    public List<String> getFilms() {
        return films;
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
    public String getActingSchool() {
        return actingSchool;
    }

    @Override
    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    @Override
    public void setFilms(List<String> films) {
        this.films = films;
    }

    @Override
    public void addFilm(String filmName) {

    }

    @Override
    public String getSchool() {
        return null;
    }

    @Override
    public void setSchool(String school) {

    }
}
