package com.aneal.bgn.ch6;

import com.aneal.bgn.ch4.hierarchy.*;

import java.util.ArrayList;
import java.util.List;

public class OperatorDemo {
    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();

        Musician john = new Performer("John", 40, 1.91f, Gender.MALE, "");
        List<String> songs = List.of("Gravity");
        john.setSongs(songs);
        artists.add(john);

//        Graphician diana = new Graphician("Diana", 23, 1.62f, Gender.
//                FEMALE, "macOs"); //artists.add(diana);

        for (Artist artist: artists){
            if(artist instanceof Musician){ // (*)
                Musician musician = (Musician) artist; // (**)
                System.out.println("Songs: " + musician.getSongs());
            } else{
                System.out.println("Other Type: " + artist.getClass());
            }
        }
    }
}
