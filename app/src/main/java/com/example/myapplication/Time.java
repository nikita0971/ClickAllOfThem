package com.example.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Date;
import java.util.TimerTask;

import com.example.myapplication.MainActivity;
import com.example.myapplication.Monsters.Monsters;


class Time extends AppCompatActivity
{
    private ImageView IV1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IV1 = (ImageView)findViewById(R.id.monstrik1);

    }

    static long getTime() {
        Date date = new Date();

        return date.getTime() / 1000;
    }



        TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            Monsters.HitDamage(MainActivity.DPS);
        }
    };
}