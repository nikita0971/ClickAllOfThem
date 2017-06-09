package com.example.myapplication;

import android.widget.Button;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;

public class DPSLot extends Lot {

    private double ImprovementBonus;
    private int HeroUnlockOrder;
    private double PurchaseCost;
    private Button button;

    public double getImprovementBonus() {
        return ImprovementBonus;
    }

    public int getHeroUnlockOrder() {
        return HeroUnlockOrder;
    }

    public double getPurchaseCost() {
        return PurchaseCost;
    }

    public double getCost(double curentLevel){
        return PurchaseCost / 10 * pow(1.082, getCurentLevel());
    }

    public void buyLot( double Credits ) {
        ImprovementBonus = getCurentLevel() % 10;
        MainActivity.Credits -= getCost(getCurentLevel());
        PurchaseCost = getCost(getCurentLevel());
        HeroUnlockOrder++;
        MainActivity.DPS = PurchaseCost / 10 * pow(1 - 23 / 1000 * min(HeroUnlockOrder, 34), min(HeroUnlockOrder, 34)) * ImprovementBonus;
    }


}
