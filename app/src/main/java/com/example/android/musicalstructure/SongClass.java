package com.example.android.musicalstructure;


public class SongClass{

    private String mSong;
    private String mDuration;


    public SongClass (String Song, String Duration){
       mSong = Song;
        mDuration = Duration+" seconds";
    }

    public String getDuration(){

        return mDuration;
    }
    public String getSong(){

        return mSong;
    }
}
