package com.example.android.bcc_2018;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;

import com.example.android.bcc_2018.R;


public class WhatIsBreastCancer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_breast_cancer);

        //for changing fonts for various textviews
            TextView t1 = (TextView)findViewById(R.id.MAIN_HEADING_wibc);
            TextView t2 = (TextView)findViewById(R.id.TEXTVIEW_SCROLLVIEW_wibc);
        TextView t3 = (TextView)findViewById(R.id.MAIN_HEADING_tnbc);
        TextView t4 = (TextView)findViewById(R.id.TEXTVIEW_1_tnbc);
        TextView t5 = (TextView)findViewById(R.id.TEXTVIEW_2_tnbc);
        TextView t6 = (TextView)findViewById(R.id.TEXTVIEW_3_tnbc);

        // Create a TypeFace using font from Assets folder
            Typeface tf_bold = Typeface.createFromAsset(getAssets(), "fonts/robo_bold.ttf");
            Typeface tf_thin = Typeface.createFromAsset(getAssets(), "fonts/robo_thin.ttf");


        // set TypeFace to the TextView or Edittext
            t1.setTypeface(tf_bold);
            t3.setTypeface(tf_bold);
            t2.setTypeface(tf_thin);
        t4.setTypeface(tf_thin);
        t5.setTypeface(tf_thin);
        t6.setTypeface(tf_thin);


    }



}
