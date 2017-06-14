package com.example.myapplication;

import android.widget.Button;

import static java.lang.Math.pow;

/**
 * Created by Никита on 09.06.2017.
 */

public abstract class Lot {
    private static double curentLevel;
    private static double Cost;

    public double getCurentLevel() {
        return curentLevel;
    }

    public abstract double getCost(double curentLevel);

    public abstract void buyLot( double Credits );

    public abstract void createLot(double improvementBonus, int heroUnlockOrder, double purchaseCost, Button button);

}



