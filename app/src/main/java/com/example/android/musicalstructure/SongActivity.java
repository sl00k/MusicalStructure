package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard_list);

        ArrayList<SongClass> song = new ArrayList<SongClass>();
        song.add(new SongClass("song1","130"));
        song.add(new SongClass("song2","230"));
        song.add(new SongClass("song3","1240"));

        SongAdapter adapter = new SongAdapter(this,song);

        ListView listView =(ListView) findViewById(R.id.standard_list);
        listView.setAdapter(adapter);
    }}