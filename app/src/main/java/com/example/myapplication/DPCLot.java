package com.example.myapplication;

import android.provider.ContactsContract;
import android.widget.Button;
import static java.lang.Math.pow;

public class DPCLot extends Lot {
    private double ImprovementBonus;
    private Button DPCButton;

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
    public void createLot(double improvementBonus, int heroUnlockOrder, double purchaseCost, Button button) {
        ImprovementBonus = improvementBonus;
        DPCButton = button;
    }
}
