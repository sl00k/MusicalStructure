package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard_list);

        ArrayList<AlbumClass> album = new ArrayList<AlbumClass>();
        album.add(new AlbumClass(getString(R.string.Album1), getString(R.string.Artist1)));
        album.add(new AlbumClass(getString(R.string.Album2), getString(R.string.Artist2)));
        album.add(new AlbumClass(getString(R.string.Album3), getString(R.string.Artist3)));

        AlbumAdapter adapter = new AlbumAdapter(this,album);

        ListView listView =(ListView) findViewById(R.id.standard_list);
        listView.setAdapter(adapter);
    }}
