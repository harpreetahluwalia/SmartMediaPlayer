package com.enigmaticdevs.smartvideoplayer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences sharedPreferences=getSharedPreferences("com.enigmaticdevs.zodiachoroscopes",MODE_PRIVATE);
        if(sharedPreferences.getString("mode","light").equals("light")){

        }
        super.onCreate(savedInstanceState);




        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(SplashActivity.this,VideoFolder.class);
                startActivity(i);
                finish();
            }
        }, 800);
    }
}
