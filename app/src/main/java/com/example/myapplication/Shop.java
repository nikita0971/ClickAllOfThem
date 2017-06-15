package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.Monsters.Monsters;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button1:
                MainActivity.DPC += 10;
            case R.id.button2:
                MainActivity.DPC += 20;

        }

    }
}
