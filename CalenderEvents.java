package com.example.android.bcc_2018;
import android.graphics.Typeface;
import android.util.Log;
import  android.widget.TextView;
import java.util.Calendar;
import android.support.v4.app.NotificationCompat;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

import com.example.android.bcc_2018.R;

public class CalenderEvents extends AppCompatActivity {


    private static final int uniqueID = 8687;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_events);



        //for changing fonts for various textviews
        TextView events = (TextView)findViewById(R.id.textView_events);

        TextView m_jan = (TextView)findViewById(R.id.monthname_Jan);
        TextView d_jan = (TextView)findViewById(R.id.day_jan);
        TextView dt_jan = (TextView)findViewById(R.id.date_jan);
        TextView e_jan = (TextView)findViewById(R.id.eventname_jan);

        TextView m_apr = (TextView)findViewById(R.id.monthname_Apr);
        TextView d_apr = (TextView)findViewById(R.id.day_apr);
        TextView dt_apr = (TextView)findViewById(R.id.date_apr);
        TextView e_apr = (TextView)findViewById(R.id.eventname_apr);


        TextView m_may = (TextView)findViewById(R.id.monthname_May);
        TextView d_may = (TextView)findViewById(R.id.day_may);
        TextView dt_may = (TextView)findViewById(R.id.date_may);
        TextView e_may = (TextView)findViewById(R.id.eventname_may);


        TextView m_jun = (TextView)findViewById(R.id.monthname_June);
        TextView d_jun = (TextView)findViewById(R.id.day_june);
        TextView dt_jun = (TextView)findViewById(R.id.date_june);
        TextView e_jun = (TextView)findViewById(R.id.eventname_june);


        TextView m_oct = (TextView)findViewById(R.id.monthname_oct);
        TextView d_oct = (TextView)findViewById(R.id.day_oct);
        TextView dt_oct = (TextView)findViewById(R.id.date_oct);
        TextView e_oct = (TextView)findViewById(R.id.eventname_oct);

        // Create a TypeFace using font from Assets folder
        Typeface tf_bold = Typeface.createFromAsset(getAssets(), "fonts/robo_bold.ttf");
        Typeface tf_thin = Typeface.createFromAsset(getAssets(), "fonts/robo_thin.ttf");
        Typeface tf_reg = Typeface.createFromAsset(getAssets(), "fonts/robo_reg.ttf");

         //set TypeFace to the TextView or Edittext
        events.setTypeface(tf_bold);
        d_jan.setTypeface(tf_thin);
        dt_jan.setTypeface(tf_thin);
        d_apr.setTypeface(tf_thin);
        dt_apr.setTypeface(tf_thin);
        d_may.setTypeface(tf_thin);
        dt_may.setTypeface(tf_thin);
        d_jun.setTypeface(tf_thin);
        dt_jun.setTypeface(tf_thin);
        d_oct.setTypeface(tf_thin);
        dt_oct.setTypeface(tf_thin);

        m_jan.setTypeface(tf_thin);
        e_jan.setTypeface(tf_thin);
        m_apr.setTypeface(tf_thin);
        e_apr.setTypeface(tf_thin);
        m_may.setTypeface(tf_thin);
        e_may.setTypeface(tf_thin);
        m_jun.setTypeface(tf_thin);
        e_jun.setTypeface(tf_thin);
        m_oct.setTypeface(tf_thin);
        e_oct.setTypeface(tf_thin);



//
    }  //for floating back button
//        Button btn =  (Button)findViewById(R.id.floating_back_button);
//        btn.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(CalenderEvents.this, HomeNavBar.class);
//                startActivity(intent);
//            }
//        });


    //check all the values against the sys time to see if there is a match
//    public void checkForEventMatch()
//    {
//        NotificationCompat.Builder notif = new NotificationCompat.Builder(this).setAutoCancel(true);
//
//        //to fetch system date and time and store in a desired format
//        Calendar cal = Calendar.getInstance();
//        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("dd:MM:yyyy");
//        String systime = format.format(cal.getTime());
//        Log.v("CalendarEvents","System date is "+systime);
//
//
//        //to store values in an array
//        String yearlyEvents[] = {"07:04:2018", "12:05:2018", "30:06:2018", "10:08:2018"};
//        String eventName[] = {"We Believe Gala", "Workshop In Hamilton", "Workshop in Mississauga", "Workshop in Toronto"};
//
//        int i;
//        for(i=0; i<4; i++)
//        {
//            if (systime.equals(yearlyEvents[i]))
//            {
//                //5==9
//                //systime.equals(yearlyEvents[i]
//                       notif.setSmallIcon(R.drawable.ic_menu_camera
//                       );
//                notif.setTicker("Breast Cancer Canada - You have a notification");
//                notif.setWhen(System.currentTimeMillis());
//                notif.setContentTitle("You have an event coming up");
//                notif.setContentText(eventName[i] + " " + yearlyEvents[i]);
//
//                Intent intent = new Intent(this, CalenderEvents.class);
//                PendingIntent penInt = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//                notif.setContentIntent(penInt);
//
//                //build notification and issue it
//                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//                nm.notify(uniqueID, notif.build());
//            }
//        }
//
//    }

}
