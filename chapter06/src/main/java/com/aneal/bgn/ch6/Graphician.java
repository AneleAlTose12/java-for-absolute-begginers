package com.aneal.bgn.ch6;

import com.aneal.bgn.ch4.hierarchy.Artist;
import com.aneal.bgn.ch4.hierarchy.Gender;
import com.aneal.bgn.ch4.hierarchy.Human;

public class Graphician extends Human implements Artist {
    public Graphician(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String getSchool() {
        return null;
    }

    @Override
    public void setSchool(String school) {

    }

    @Override
    public int getTimeToLive() {
        return 0;
    }
}
