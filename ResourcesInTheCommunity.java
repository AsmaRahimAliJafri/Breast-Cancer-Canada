package com.example.android.bcc_2018;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.android.bcc_2018.R;


public class ResourcesInTheCommunity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources_in_the_community);

        //for font formatting
        TextView mainTV = (TextView)findViewById(R.id.ritc);
        TextView subTV1 = (TextView)findViewById(R.id.text_1_ritc);
        TextView subTV2 = (TextView)findViewById(R.id.text_2_ritc);
        TextView hl1 = (TextView)findViewById(R.id.link_info_1);
        TextView hl2 = (TextView)findViewById(R.id.link_info_2);
        TextView hl3 = (TextView)findViewById(R.id.link_info_3);
        TextView hl4 = (TextView)findViewById(R.id.link_wigs_1);
        TextView hl5 = (TextView)findViewById(R.id.link_wigs_2);
        TextView hl6 = (TextView)findViewById(R.id.link_wigs_3);


        // Create a TypeFace using font from Assets folder
        Typeface tf_bold = Typeface.createFromAsset(getAssets(), "fonts/robo_bold.ttf");
        Typeface tf_thin = Typeface.createFromAsset(getAssets(), "fonts/robo_thin.ttf");
        Typeface tf_reg = Typeface.createFromAsset(getAssets(), "fonts/robo_reg.ttf");

        //set font typeface
        mainTV.setTypeface(tf_bold);
        subTV1.setTypeface(tf_reg);
        subTV2.setTypeface(tf_reg);
        hl1.setTypeface(tf_thin);
        hl2.setTypeface(tf_thin);
        hl3.setTypeface(tf_thin);
        hl4.setTypeface(tf_thin);
        hl5.setTypeface(tf_thin);
        hl6.setTypeface(tf_thin);


        TextView link1 = (TextView) findViewById(R.id.link_info_1);
        String linkText1 = "<a href='https://www.theolivebranch.ca'>Click here</a>";
        link1.setText(Html.fromHtml(linkText1));
        link1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link2 = (TextView) findViewById(R.id.link_info_2);
        String linkText2 = "<a href='https://www.cancercareontario.ca/en/types-of-cancer/breast-cancer'>Click here</a>";
        link2.setText(Html.fromHtml(linkText2));
        link2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link3 = (TextView) findViewById(R.id.link_info_3);
        String linkText3 = "<a href='https://www.cancercareontario.ca/en/find-cancer-services'>Click here</a>";
        link3.setText(Html.fromHtml(linkText3));
        link3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link4 = (TextView) findViewById(R.id.link_wigs_1);
        String linkText4 = "<a href='https://www.trulyyou.ca'>Click here</a>";
        link4.setText(Html.fromHtml(linkText4));
        link4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link5= (TextView) findViewById(R.id.link_wigs_2);
        String linkText5 = "<a href='https://www.wigboutiquebarrie.ca'>Click here</a>";
        link5.setText(Html.fromHtml(linkText5));
        link5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link6 = (TextView) findViewById(R.id.link_wigs_3);
        String linkText6 = "<a href='https://www.mlam.ca'>Click here</a>";
        link5.setText(Html.fromHtml(linkText6));
        link5.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
