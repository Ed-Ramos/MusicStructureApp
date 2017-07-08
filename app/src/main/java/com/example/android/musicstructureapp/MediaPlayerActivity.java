package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MediaPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        // Find the View that shows the songs button
        Button songs = (Button) findViewById(R.id.songs_button);

        // Set a click listener on that button
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MediaPlayerActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the playlists button
        Button playlists = (Button) findViewById(R.id.playlists_button);

        // Set a click listener on that button
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MediaPlayerActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the albums button
        Button albums = (Button) findViewById(R.id.albums_button);

        // Set a click listener on that button
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MediaPlayerActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the media hub button
        Button mediahub = (Button) findViewById(R.id.media_hub_button);

        // Set a click listener on that button
        mediahub.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the media hub button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent mediahubIntent = new Intent(MediaPlayerActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mediahubIntent);
            }
        });







    }
}
