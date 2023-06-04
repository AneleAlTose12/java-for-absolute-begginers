//package com.aneal.bng.ch8;
//
//import java.util.*;
//
//public class IntroToStreamsAPI01 {
//    public static void main(String[] args) {
//        List<Integer> resultedSong = new ArrayList<>();
//        List<Song> songList = new ArrayList<Song>();
//            for (Song song: songList){
//                if (song.getDuration() >= 300){
//                    resultedSong.add(song);
//
//                }
//            }
//        /**
//         * that return a result that is not a stream are called terminal operations and are obviously
//         * present at the end of a pipeline. As a quick example before getting deeper, the previous
//         * code can be written like this using streams:
//         */
//        List<String> finalList = songList.stream().filter(s -> s.getDuration()>= 300)
//                    .sorted(Comparator.comparing(Song::getDuration).reversed())
//                    .map(Song::getTitle)
//                    .collect(Collectors.toList());
//        System.out.println(finalList);
//
//    }
//}
