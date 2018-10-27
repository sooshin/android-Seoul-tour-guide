package com.example.android.tourguide.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.android.tourguide.R;
import com.example.android.tourguide.fragment.FoodFragment;
import com.example.android.tourguide.fragment.InformationFragment;
import com.example.android.tourguide.fragment.KoreanFragment;
import com.example.android.tourguide.fragment.NatureCultureFragment;
import com.example.android.tourguide.fragment.ShopFragment;
import com.example.android.tourguide.fragment.SightsFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Set the default fragment when starting the app
        if (savedInstanceState == null) {
            onNavigationItemSelected(navigationView.getMenu().getItem(0).setChecked(true));
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        // Replace the fragment using a FragmentManager and Transaction
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_info) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new InformationFragment())
                    .commit();
        } else if (id == R.id.nav_sights) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new SightsFragment())
                    .commit();
        } else if (id == R.id.nav_nature_culture) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new NatureCultureFragment())
                    .commit();
        } else if (id == R.id.nav_shop) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new ShopFragment())
                    .commit();
        } else if (id == R.id.nav_food) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new FoodFragment())
                    .commit();
        } else if (id == R.id.nav_basic_korean) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new KoreanFragment())
                    .commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
