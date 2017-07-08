package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the albums button
        Button albums = (Button) findViewById(R.id.albums_button);

        // Set a click listener on that button
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the songs button
        Button songs = (Button) findViewById(R.id.songs_button);

        // Set a click listener on that button
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

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
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the payment button
        Button payment = (Button) findViewById(R.id.payment__button);

        // Set a click listener on that button
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the payment button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PaymentActivity}
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });

    }
}
