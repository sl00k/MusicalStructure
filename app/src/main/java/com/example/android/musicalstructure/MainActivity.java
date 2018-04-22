package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the album category
        TextView album = (TextView) findViewById(R.id.album_text_view);

        // Set a click listener on that View
        album.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the song category
        TextView song = (TextView) findViewById(R.id.song_text_view);

        // Set a click listener on that View
        song.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link songActivity}
                Intent songIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songIntent);
            }
        });

        // Find the View that shows the artist category
        TextView artist = (TextView) findViewById(R.id.artist_text_view);
        // Set a click listener on that View
        artist.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link artistActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistIntent);

    }});}}
