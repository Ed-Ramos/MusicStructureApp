package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Edwin on 7/8/2017.
 */

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Find the View that shows the media hub button
        Button mediahub = (Button) findViewById(R.id.media_hub_button);

        // Set a click listener on that button
        mediahub.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent mediahubIntent = new Intent(PaymentActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mediahubIntent);
            }
        });
    }
}
