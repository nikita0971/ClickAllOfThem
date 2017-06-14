package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static double DPS = 0;
    static double DPC = 10;
    static long Credits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button shopButton = (Button)findViewById(R.id.shopButton);
        shopButton.setOnClickListener(this);

        final Button hitButton = (Button)findViewById(R.id.hitButton);
        hitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shopButton:
                Intent intent = new Intent(this, Shop.class);
                startActivity(intent);
                break;
            case R.id.hitButton:

            default:
                break;
        }

    }
}
