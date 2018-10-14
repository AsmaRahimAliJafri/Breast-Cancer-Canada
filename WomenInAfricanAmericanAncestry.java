package com.example.android.bcc_2018;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.bcc_2018.R;

public class WomenInAfricanAmericanAncestry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_of_aa_ancestry);

        //for font formatting
        TextView mainTV = (TextView)findViewById(R.id.textview_waaa);
        TextView subTV1 = (TextView)findViewById(R.id.text_1_waaa);
        TextView subTV2 = (TextView)findViewById(R.id.text_2_waaa);



        // Create a TypeFace using font from Assets folder
        Typeface tf_bold = Typeface.createFromAsset(getAssets(), "fonts/robo_bold.ttf");
        Typeface tf_thin = Typeface.createFromAsset(getAssets(), "fonts/robo_thin.ttf");
        Typeface tf_reg = Typeface.createFromAsset(getAssets(), "fonts/robo_reg.ttf");

        mainTV.setTypeface(tf_bold);
        subTV1.setTypeface(tf_reg);
        subTV2.setTypeface(tf_reg);

    }
}
