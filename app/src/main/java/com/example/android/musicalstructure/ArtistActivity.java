package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard_list);

        ArrayList<ArtistClass> artist = new ArrayList<ArtistClass>();
        artist.add(new ArtistClass("Artist1",  "Genre1"));
        artist.add(new ArtistClass("Artist2",  "Genre2"));
        artist.add(new ArtistClass("Artist3",  "Genre3"));
        artist.add(new ArtistClass("Artist1",  "Genre1"));
        artist.add(new ArtistClass("Artist2",  "Genre2"));
        artist.add(new ArtistClass("Artist3",  "Genre3"));
        artist.add(new ArtistClass("Artist1",  "Genre1"));
        artist.add(new ArtistClass("Artist2",  "Genre2"));
        artist.add(new ArtistClass("Artist3",  "Genre3"));
        artist.add(new ArtistClass("Artist1",  "Genre1"));
        artist.add(new ArtistClass("Artist2",  "Genre2"));
        artist.add(new ArtistClass("Artist3",  "Genre3"));

        ArtistAdapter adapter = new ArtistAdapter(this, artist);
        ListView listview = (ListView) findViewById(R.id.standard_list);
        listview.setAdapter(adapter);

    }}
