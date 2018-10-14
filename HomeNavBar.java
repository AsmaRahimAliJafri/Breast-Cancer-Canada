package com.example.android.bcc_2018;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.bcc_2018.R;

import java.util.Calendar;

public class HomeNavBar extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final int uniqueID = 8687;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_nav_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* ImageView img = (ImageView)findViewById(R.id.homeview_background);
        Picasso.with(this).load(R.drawable.bcc_bitmap).into(img);*/
        //calls eent checker
        checkForEventMatch();

// **********************   FLOATING BUTTON REMOVED **********************

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
// ********************************************************************************


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_nav_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.aboutBreastCancer) {
            Intent intent1 = new Intent(HomeNavBar.this, WhatIsBreastCancer.class);
            startActivity(intent1);
        }
        else if (id == R.id.res_in_community) {
            Intent this_intent2 = new Intent(HomeNavBar.this, ResourcesInTheCommunity.class);
            startActivity(this_intent2);
        }
        else if (id == R.id.cal_event) {
            Intent this_intent3 = new Intent(HomeNavBar.this, CalenderEvents.class);
            startActivity(this_intent3);
        }
         else if (id == R.id.lstyle) {
            Intent this_intent4 = new Intent(HomeNavBar.this, Lifestyle.class);
            startActivity(this_intent4);
        }

        else if(id == R.id.faqs) {
            Intent this_intent5 = new Intent(HomeNavBar.this, QuestionsToAskYourPhysician.class);
            startActivity(this_intent5);
        }

        else if (id == R.id.don) {
            Intent this_intent6 = new Intent(HomeNavBar.this, donate.class);
            startActivity(this_intent6);
        }
        else if (id == R.id.resources_page) {
            Intent this_intent7 = new Intent(HomeNavBar.this, Research.class);
            startActivity(this_intent7);
        }
        else if (id == R.id.women_of_aa) {
            Intent this_intent8= new Intent(HomeNavBar.this, WomenInAfricanAmericanAncestry.class);
            startActivity(this_intent8);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //check all the values against the sys time to see if there is a match
    public void checkForEventMatch()
    {
        NotificationCompat.Builder notif = new NotificationCompat.Builder(this).setAutoCancel(true);

        //to fetch system date and time and store in a desired format
        Calendar cal = Calendar.getInstance();
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("dd:MM:yyyy");
        String systime = format.format(cal.getTime());
        Log.v("CalendarEvents","System date is "+systime);


        //to store values in an array
        String yearlyEvents[] = {"08:04:2018", "12:05:2018", "30:06:2018", "10:08:2018"};
        String eventName[] = {"We Believe Gala", "Workshop In Hamilton", "Workshop in Mississauga", "Workshop in Toronto"};

        int i;
        for(i=0; i<4; i++)
        {
            if (systime.equals(yearlyEvents[i]))
            {
                //5==9
                //systime.equals(yearlyEvents[i]
                notif.setSmallIcon(R.drawable.ic_star_black_24dp
                );
                notif.setTicker("Breast Cancer Canada - You have a notification");
                notif.setWhen(System.currentTimeMillis());
                notif.setContentTitle("You have an event coming up");
                notif.setContentText(eventName[i] + " " + yearlyEvents[i]);

                Intent intent = new Intent(this, CalenderEvents.class);
                PendingIntent penInt = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
                notif.setContentIntent(penInt);

                //build notification and issue it
                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nm.notify(uniqueID, notif.build());
            }
        }

    }

}
