//Actor.java
package com.aneal.bgn.ch4.hierarchy;

import java.util.List;

public interface Actor extends Artist{
    String getActingSchool();
    void setActingSchool(String actingSchool);
    List<String> getFilms();
    void setFilms(List<String> films);
    void addFilm(String filmName);
}
