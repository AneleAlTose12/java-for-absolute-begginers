//Musician.java
package com.aneal.bgn.ch4.hierarchy;

import java.util.List;

public interface Musician extends Artist{
    String getMusicSchool(String musicSchool);
    List<String > getSongs();
    void setSongs(List<String> songs);
    String getGenre();
    void setGenre(String genre);
}

