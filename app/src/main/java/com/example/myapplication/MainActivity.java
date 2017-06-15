package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.graphics.graphics;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static double DPS = 0;
    public static double DPC = 10;
    public static long Credits = 0;
    static float deg = -45;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button shopButton = (Button)findViewById(R.id.shopButton);
        shopButton.setOnClickListener(this);

        final Button hitButton = (Button)findViewById(R.id.hitButton);
        hitButton.setOnClickListener(this);

        final TextView TextMoney = (TextView)findViewById(R.id.TextMoney);
        TextMoney.setText("Coins: " + MainActivity.Credits);

        final TextView TextStatistics = (TextView)findViewById(R.id.TextStatistics);
        TextStatistics.setText("DPC: " + (int)MainActivity.DPC  +
                               "DPS: " + (int)MainActivity.DPS);
    }
    public void rotate(float degree)
    {
        ImageView weapon1 = (ImageView)findViewById(R.id.weapon1);
        final RotateAnimation rotateAnim = new RotateAnimation(-45, degree - 45, 0f, weapon1.getHeight());

        rotateAnim.setDuration(0);
        rotateAnim.setFillAfter(true);
        weapon1.startAnimation(rotateAnim);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.shopButton:
                Intent intent = new Intent(this, Shop.class);
                startActivity(intent);
                break;
            case R.id.hitButton:
                rotate(deg);
                deg = -deg;
                break;
            default:
                break;
        }

    }
}
