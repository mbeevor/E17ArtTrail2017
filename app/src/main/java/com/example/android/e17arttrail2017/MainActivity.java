package com.example.android.e17arttrail2017;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // index to identify current nav menu item
    public static int navItemIndex = 0;
    private String[] activityTypes;
    private DrawerLayout drawerLayout;
    private ListView drawerList;
    private Toolbar toolbar;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find resources for navigation drawer
        activityTypes = getResources().getStringArray(R.array.menu_list);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);

        // Create an adapter for the list view within navigation drawer
        drawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, activityTypes));

        // Set onClickListeners for each item in navigation drawer
        drawerList.setOnItemClickListener(new NavigationDrawer());
    }

    public class NavigationDrawer implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            displayView(position);
        }

        // update view based on menu item selected
        private void displayView(int position) {
            fragment = null;
            switch (position) {
                case 0:
                    fragment = new EventsFragment();
                    break;
                case 1:
                    fragment = new OffTheMapFragment();
                    break;
                case 2:
                    fragment = new BlackhorseFragment();
                    break;
                default:
                    break;
            }

            // Update the main content view with selected fragment
            if (fragment != null) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content, fragment).commit();

                // Highlight the selected item and close the drawer
                drawerList.setItemChecked(position, true);
                drawerLayout.closeDrawer(drawerList);
            }
        }
    }

}


