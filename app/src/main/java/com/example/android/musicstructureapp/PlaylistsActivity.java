package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


        // Find the View that shows the songs button
        Button songs = (Button) findViewById(R.id.songs_button);

        // Set a click listener on that button
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the playlists button
        Button albums = (Button) findViewById(R.id.albums_button);

        // Set a click listener on that button
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent albumsIntent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the media player button
        Button mediaplayer = (Button) findViewById(R.id.media_player_button);

        // Set a click listener on that button
        mediaplayer.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the media player button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MediaPlayerActivity}
                Intent mediaplayerIntent = new Intent(PlaylistsActivity.this, MediaPlayerActivity.class);

                // Start the new activity
                startActivity(mediaplayerIntent);
            }
        });

        // Find the View that shows the media hub button
        Button mediahub = (Button) findViewById(R.id.media_hub_button);

        // Set a click listener on that button
        mediahub.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent mediahubIntent = new Intent(PlaylistsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mediahubIntent);
            }
        });




    }
}
