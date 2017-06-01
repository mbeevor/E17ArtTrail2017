package com.example.android.e17arttrail2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by mbeev on 01/06/2017.
 */

public class SponsorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_activity);

        TextView textViewHeading = (TextView) findViewById(R.id.drawer_heading);
        textViewHeading.setText(R.string.sponsor);

        TextView textViewSubHeading = (TextView) findViewById(R.id.drawer_sub_heading);
        textViewSubHeading.setText(R.string.sponsor_sub_heading);

        TextView textView = (TextView) findViewById(R.id.drawer_text);
        textView.setText(R.string.sponsor_text);

        // Set Toolbar to replace the ActionBar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create toolbar menu icon
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

}
