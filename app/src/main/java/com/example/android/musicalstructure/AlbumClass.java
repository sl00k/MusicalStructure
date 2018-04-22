package com.example.android.musicalstructure;


public class AlbumClass{

    private String mAlbum;
    private String mArtist;


    public AlbumClass (String Album, String Artist){
        mAlbum = Album;
        mArtist = Artist;
    }

    public String getAlbum(){

        return mAlbum;
    }
    public String getArtist(){

        return mArtist;
    }
}

