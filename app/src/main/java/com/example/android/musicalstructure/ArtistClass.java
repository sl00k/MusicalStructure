package com.example.android.musicalstructure;

public class ArtistClass{

    private String mGenre;
    private String mArtist;


    public ArtistClass (String Artist, String Genre){
        mGenre = Genre;
        mArtist = Artist;
    }

    public String getGenre(){

        return mGenre;
    }
    public String getArtist(){

        return mArtist;
    }
}
