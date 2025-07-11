package org.example;

import java.util.*;

public class MainTest {

    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Song A", "Artist 1"),
                new Song("Song B", "Artist 2"),
                new Song("Song C", "Artist 1"),
                new Song("Song A", "Artist 1")
        );

        Set<Song> set1 = new HashSet<>();

        for(Song i : songs)
        {
            set1.add(i);
        }

        for(Song i : set1)
        {
            System.out.println(i.getSongName() + " by " + i.getArtist());
        }
    }
}
