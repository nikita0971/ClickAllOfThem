package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.Lots.DPCLot;
import com.example.myapplication.Lots.DPSLot;

public class Shop extends AppCompatActivity implements View.OnClickListener {

    DPCLot LOT1;
    DPSLot LOT2, LOT3, LOT4, LOT5, LOT6;

    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        final Button Lot1 = (Button)findViewById(R.id.Lot1);
        Lot1.setOnClickListener(this);
        LOT1 = new DPCLot(1, 1, 10);

        final Button Lot2 = (Button)findViewById(R.id.Lot2);
        Lot2.setOnClickListener(this);
        LOT2 = new DPSLot(1, 0, 1, 30);

        final Button Lot3 = (Button)findViewById(R.id.Lot3);
        Lot3.setOnClickListener(this);
        LOT3 = new DPSLot(1, 0, 2, 180);

        final Button Lot4 = (Button)findViewById(R.id.Lot4);
        Lot4.setOnClickListener(this);
        LOT4 = new DPSLot(1, 0, 3, 800);

        final Button Lot5 = (Button)findViewById(R.id.Lot5);
        Lot5.setOnClickListener(this);
        LOT5 = new DPSLot(1, 0, 4, 4000);

        final Button Lot6 = (Button)findViewById(R.id.Lot6);
        Lot6.setOnClickListener(this);
        LOT6 = new DPSLot(1, 0, 5, 24000);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Lot1:
                LOT1.buyLot();
                break;
            case R.id.Lot2:
                LOT2.buyLot();
                editText.setText(Integer.toString((int)MainActivity.DPS));
                break;
            case R.id.Lot3:
                LOT3.buyLot();
                break;
            case R.id.Lot4:
                LOT4.buyLot();
                break;
            case R.id.Lot5:
                LOT5.buyLot();
                break;
            case R.id.Lot6:
                LOT6.buyLot();
                break;
        }
    }
}