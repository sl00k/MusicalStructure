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
        artist.add(new ArtistClass(getString(R.string.Artist1), getString(R.string.Rock)));
        artist.add(new ArtistClass(getString(R.string.Artist2), getString(R.string.Pop)));
        artist.add(new ArtistClass(getString(R.string.Artist3), getString(R.string.Jazz)));
        artist.add(new ArtistClass(getString(R.string.Artist3), getString(R.string.Rock)));
        artist.add(new ArtistClass(getString(R.string.Artist2), getString(R.string.Rock)));
        artist.add(new ArtistClass(getString(R.string.Artist2), getString(R.string.Jazz)));
        artist.add(new ArtistClass(getString(R.string.Artist1), getString(R.string.Jazz)));
        artist.add(new ArtistClass(getString(R.string.Artist1), getString(R.string.Pop)));
        artist.add(new ArtistClass(getString(R.string.Artist3), getString(R.string.Rock)));
        artist.add(new ArtistClass(getString(R.string.Artist2), getString(R.string.Jazz)));
        artist.add(new ArtistClass(getString(R.string.Artist3), getString(R.string.Jazz)));
        artist.add(new ArtistClass(getString(R.string.Artist1), getString(R.string.Rock)));

        ArtistAdapter adapter = new ArtistAdapter(this, artist);
        ListView listview = (ListView) findViewById(R.id.standard_list);
        listview.setAdapter(adapter);

    }}
