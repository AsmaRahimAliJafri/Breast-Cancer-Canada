package com.example.android.bcc_2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.android.bcc_2018.R;
import com.squareup.picasso.Picasso;

public class Lifestyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifestyle);

        ImageView img = (ImageView)findViewById(R.id.nutrition_imageview);
         Picasso.with(this).load(R.drawable.nutri_compress_bitmap).into(img);
//        Picasso.get().load(R.drawable.nutri).into(img);

//        img.setImageDrawable(getResources().getDrawable(R.drawable.nutri_compress));
    }
}
