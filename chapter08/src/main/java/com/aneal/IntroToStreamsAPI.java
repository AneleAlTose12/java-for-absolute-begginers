//package com.aneal;
//
//import java.util.*;
//
///**
// * Consider a really big collection of songs that we want to analyze. We want to find all
// * songs with duration of at least 300 seconds. We want to save the names of these songs in
// * a list and sort them by decreasing order of their duration. Assuming we already have the
// * songs in a list, the code looks like this:
// */
//public class IntroToStreamsAPI {
//    public static void main(String[] args) {
//        List<Integer> songsList = new ArrayList<>();
//        List<Song> resultedSongs = new ArrayList<>();
//
//        for (Song song: songsList){
//            if (song.getDuration() >= 300){
//                resultedSongs.add(song);
//            }
//        }
//        Collections.sort(resultedSongs, new Comparator<Song>(){
//            public int compare(Song s1, Song s2){
//                return s2.getDuration().compareTo(s1.getDuration());
//            }
//        });
//        System.out.println(resultedSongs);
//        List<String> finalList = new ArrayList<>();
//        for (Song song: resultedSongs){
//            finalList.add(song.getTitle());
//        }
//        System.out.println(finalList);
//    }
//}