package com.example.myapplication;

import com.example.myapplication.MainActivity;

import static java.lang.Math.pow;

public class DPCLot extends Lot {
    private double ImprovementBonus;

    public double getImprovementBonus() {
        return ImprovementBonus;
    }

    public double getCost( double curentLevel ) {
        return 5 * (pow(1.062, curentLevel + 1) - pow(1.062, curentLevel)) / 0.062;
    }

    public void buyLot( double Credits ){
        ImprovementBonus = getCurentLevel() % 10;
        MainActivity.Credits -= getCost(getCurentLevel());
        MainActivity.DPC = getCurentLevel() * ImprovementBonus;
    }
}
