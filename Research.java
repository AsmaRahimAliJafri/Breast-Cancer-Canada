package com.example.android.bcc_2018;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.bcc_2018.R;


public class Research extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);

        //for font formatting
        TextView mainTV = (TextView)findViewById(R.id.jdlr);
        TextView subTV1 = (TextView)findViewById(R.id.text_1_research);
        TextView subTV2 = (TextView)findViewById(R.id.text_2_research);
        TextView subTV3 = (TextView)findViewById(R.id.text_3_research);
        TextView subTV4 = (TextView)findViewById(R.id.text_4_research);


        // Create a TypeFace using font from Assets folder
        Typeface tf_bold = Typeface.createFromAsset(getAssets(), "fonts/robo_bold.ttf");
        Typeface tf_thin = Typeface.createFromAsset(getAssets(), "fonts/robo_thin.ttf");
        Typeface tf_reg = Typeface.createFromAsset(getAssets(), "fonts/robo_reg.ttf");

        mainTV.setTypeface(tf_bold);
        subTV1.setTypeface(tf_reg);
        subTV2.setTypeface(tf_reg);
        subTV3.setTypeface(tf_reg);
        subTV4.setTypeface(tf_reg);


    }
}
