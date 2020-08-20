package com.example.musicalapp;

public class SongInfo {

    private String NameSinger;
    private String NameSong;

    public SongInfo(String singer, String song) {
        NameSinger = singer;
        NameSong = song;

    }

    public String getNameSinger() {
        return NameSinger;
    }

    public String getNameSong() {
        return NameSong;
    }
}
