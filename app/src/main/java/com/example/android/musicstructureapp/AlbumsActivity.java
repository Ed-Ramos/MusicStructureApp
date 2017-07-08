package com.example.android.musicstructureapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the View that shows the songs button
        Button songs = (Button) findViewById(R.id.songs_button);

        // Set a click listener on that button
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the playlists button
        Button playlists = (Button) findViewById(R.id.playlists_button);

        // Set a click listener on that button
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(AlbumsActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
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
                Intent mediaplayerIntent = new Intent(AlbumsActivity.this, MediaPlayerActivity.class);

                // Start the new activity
                startActivity(mediaplayerIntent);
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
                Intent mediahubIntent = new Intent(AlbumsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mediahubIntent);
            }
        });

        // Find the View that shows the artist website image
        ImageView artistwebsiteimage = (ImageView) findViewById(R.id.artist_website_image);

        // Set a click listener on that Image
        artistwebsiteimage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist website Image is clicked on.
            @Override
            public void onClick(View view) {
                String url = "http://www.coldplay.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
