package com.example.android.e17arttrail2017;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ListView drawerList;
    private ActionBarDrawerToggle drawerToggle;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find resources for navigation tabs
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        // Find resources for navigation drawer
        String[] drawerMenu = getResources().getStringArray(R.array.drawer_menu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);

        // Add header image to nav drawer
        LayoutInflater inflater = getLayoutInflater();
        View listHeaderView = inflater.inflate(R.layout.nav_header, null, false);
        drawerList.addHeaderView(listHeaderView);

        // Set Toolbar to replace the ActionBar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Extend ActionBarDrawerToggle to listen to opening and closing of navigation drawer
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.addDrawerListener(drawerToggle);

        // Create toolbar menu icon
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        // Create an adapter for the list view within navigation drawer
        drawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.menu_list_item, drawerMenu));

        // Set onClickListeners for each item in navigation drawer
//        drawerList.setOnItemClickListener(new NavigationDrawerSelection());

        // Set up tab layout
        TabAdapter adapter = new TabAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    // Convert toolbar menu icon to 'hamburger'
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }


//    public class NavigationDrawerSelection implements ListView.OnItemClickListener {
//
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            displayFragment(position);
//        }
//
//        // update view based on menu item selected
//        public void displayFragment(int position) {
//            Fragment fragment;
//            switch (position) {
//                case 0:
//                    fragment = new HomeFragment();
//                    break;
//                case 1:
//                    fragment = new EventsFragment();
//                    break;
//                case 2:
//                    fragment = new OffTheMapFragment();
//                    break;
//                case 3:
//                    fragment = new BlackhorseFragment();
//                    break;
//                default:
//                    fragment = new HomeFragment();
//                    break;
//            }
//
//            // Update the main content view with selected fragment
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            fragmentManager.beginTransaction().replace(R.id.view_pager, fragment).commit();
//
//            // Highlight the selected item and close the drawer
//            drawerList.setItemChecked(position, true);
//            drawerLayout.closeDrawer(drawerList);
//        }
//    }

    // method to return to last fragment on user pressing 'back'
    @Override
    public void onBackPressed() {
        assert drawerLayout != null;
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}

