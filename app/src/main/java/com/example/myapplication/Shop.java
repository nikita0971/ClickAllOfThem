package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.App;

public class Shop extends AppCompatActivity implements View.OnClickListener {

    Button Lot1, Lot2, Lot3, Lot4, Lot5, Lot6;

    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Lot1 = (Button)findViewById(R.id.Lot1);
        Lot1.setOnClickListener(this);
        Lot1.setText("Cost: " + (int)App.getLOT1().getCost(App.getLOT1().getCurrentLVL()) + " DPC + " + (int)App.getLOT1().getDMG());

        Lot2 = (Button)findViewById(R.id.Lot2);
        Lot2.setOnClickListener(this);
        Lot2.setText("Cost: " + (int)App.getLOT2().getCost(App.getLOT2().getCurrentLVL()) + "  DPS + " + (int)App.getLOT2().getDMG());

        Lot3 = (Button)findViewById(R.id.Lot3);
        Lot3.setOnClickListener(this);
        Lot3.setText("Cost: " + (int)App.getLOT3().getCost(App.getLOT3().getCurrentLVL()) + "  DPS + " + (int)App.getLOT3().getDMG());

        Lot4 = (Button)findViewById(R.id.Lot4);
        Lot4.setOnClickListener(this);
        Lot4.setText("Cost: " + (int)App.getLOT4().getCost() + "  DPS + " + (int)App.getLOT4().getDMG());

        Lot5 = (Button)findViewById(R.id.Lot5);
        Lot5.setOnClickListener(this);
        Lot5.setText("Cost: " + (int)App.getLOT5().getCost() + "  DPS + " + (int)App.getLOT5().getDMG());

        Lot6 = (Button)findViewById(R.id.Lot6);
        Lot6.setOnClickListener(this);
        Lot6.setText("Cost: " + (int)App.getLOT6().getCost() + "  DPS + " + (int)App.getLOT6().getDMG());

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Lot1:
                App.getLOT1().buyLot();
                Lot1.setText("Cost: " + (int)App.getLOT1().getCost(App.getLOT1().getCurrentLVL()) + " DPC + " + (int)App.getLOT1().getDMG());
                break;
            case R.id.Lot2:
                App.getLOT1().buyLot();
                Lot2.setText("Cost: " + (int)App.getLOT2().getCost(App.getLOT2().getCurrentLVL()) + "  DPS + " + (int)App.getLOT2().getDMG());
                break;
            case R.id.Lot3:
                App.getLOT1().buyLot();
                Lot3.setText("Cost: " + (int)App.getLOT3().getCost(App.getLOT3().getCurrentLVL()) + "  DPS + " + (int)App.getLOT3().getDMG());
                break;
            case R.id.Lot4:
                App.getLOT1().buyLot();
                Lot4.setText("Cost: " + (int)App.getLOT4().getCost() + "  DPS + " + (int)App.getLOT4().getDMG());
                break;
            case R.id.Lot5:
                App.getLOT1().buyLot();
                Lot5.setText("Cost: " + (int)App.getLOT5().getCost() + "  DPS + " + (int)App.getLOT5().getDMG());
                break;
            case R.id.Lot6:
                App.getLOT1().buyLot();
                Lot6.setText("Cost: " + (int)App.getLOT6().getCost() + "  DPS + " + (int)App.getLOT6().getDMG());
                break;
        }
    }
}