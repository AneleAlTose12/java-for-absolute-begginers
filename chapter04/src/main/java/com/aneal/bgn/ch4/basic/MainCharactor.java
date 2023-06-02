package com.aneal.bgn.ch4.basic;

import com.aneal.bgn.ch4.hierarchy.Actor;
import com.aneal.bgn.ch4.hierarchy.Gender;
import com.aneal.bgn.ch4.hierarchy.Human;

import java.util.List;

public class MainCharactor extends Human implements Actor {
    private String actingSchool;
    private List<String> films;

    public MainCharactor(String name, int age, Gender gender, String actingSchool) {
        super(name, age, gender);
        this.actingSchool = actingSchool;
    }
    public MainCharactor(String name, int age, float height, Gender gender, String actingSchool) {
        super(name, age, height, gender);
        this.actingSchool = actingSchool;
    }
    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
    }

    public String getActingSchool() {
        return actingSchool;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

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
