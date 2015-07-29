package com.example.project.onam;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button b2;
    phonesignal p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b2 = (Button) findViewById(R.id.b1);

        // show location button click event
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                p1 = new phonesignal(MainActivity.this);


                if (p1.canGetLocation()) {

                    double latitude = p1.getLatitude();
                    double longitude = p1.getLongitude();


                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
                }

            }

        });


    }
}