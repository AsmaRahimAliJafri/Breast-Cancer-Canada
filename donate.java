package com.example.android.bcc_2018;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.android.bcc_2018.R;

public class donate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        //for font formatting
        TextView mainTV = (TextView)findViewById(R.id.textview_donate);
        TextView subTV1 = (TextView)findViewById(R.id.textview1_donate);
        TextView subTV2 = (TextView)findViewById(R.id.textview2_donate);
        TextView hl1 = (TextView)findViewById(R.id.textview1_clickHere);
        TextView hl2 = (TextView)findViewById(R.id.textview2_clickHere);

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



        TextView link1 = (TextView) findViewById(R.id.textview1_clickHere);
        String linkText1 = "<a href='https://www.canadahelps.org/en/dn/14261'>Click here</a>";
        link1.setText(Html.fromHtml(linkText1));
        link1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link2 = (TextView) findViewById(R.id.textview2_clickHere);
        String linkText2 = "<a href='http://alumni.mcmaster.ca/s/1439/ifundmac/project.aspx?sid=1439&gid=1&pgid=5695&cid=10509&ecid=10509&crid=0&calpgid=3308&calcid=5368'>Click here</a>";
        link2.setText(Html.fromHtml(linkText2));
        link2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
