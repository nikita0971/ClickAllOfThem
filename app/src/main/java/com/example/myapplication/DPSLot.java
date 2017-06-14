package com.example.myapplication;

import android.widget.Button;

import static java.lang.Math.min;
import static java.lang.Math.pow;

public class DPSLot extends Lot {

    private double ImprovementBonus;
    private int HeroUnlockOrder;
    private double PurchaseCost;
    private Button DPSButton;

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

    public  void createLot( double improvementBonus, int heroUnlockOrder, double purchaseCost, Button button ) {
        ImprovementBonus = improvementBonus;
        HeroUnlockOrder = heroUnlockOrder;
        PurchaseCost = purchaseCost;
        DPSButton = button;
    }

    public void buyLot( double Credits ) {
        ImprovementBonus = (double)(((int)getCurentLevel() / 10) + 1);
        MainActivity.Credits -= getCost(getCurentLevel());
        PurchaseCost = getCost(getCurentLevel());
        HeroUnlockOrder++;
        MainActivity.DPS = PurchaseCost / 10 * pow(1 - 23 / 1000 * min(HeroUnlockOrder, 34), min(HeroUnlockOrder, 34)) * ImprovementBonus;
    }


}
