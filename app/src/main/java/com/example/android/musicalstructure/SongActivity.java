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
        song.add(new SongClass(getString(R.string.song1), getString(R.string.DurationSong1)));
        song.add(new SongClass(getString(R.string.song2), getString(R.string.DurationSong2)));
        song.add(new SongClass(getString(R.string.song3), getString(R.string.DurationSong3)));

        SongAdapter adapter = new SongAdapter(this,song);

        ListView listView =(ListView) findViewById(R.id.standard_list);
        listView.setAdapter(adapter);
    }}