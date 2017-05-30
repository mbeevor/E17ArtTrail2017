package com.example.android.e17arttrail2017;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] artActivities;
    private DrawerLayout drawerLayout;
    private ListView drawerList;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find resources for navigation drawer
        artActivities = getResources().getStringArray(R.array.menu_list);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);

        // Create an adapter for the list view within navigation drawer
        drawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, artActivities));

//        // Set onClickListeners for each item in navigation drawer
//        drawerList.setOnItemClickListener(new NavigationDrawer());
    }
}


