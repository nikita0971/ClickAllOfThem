package com.example.myapplication.Lots;

import com.example.myapplication.MainActivity;

import static java.lang.Math.pow;

public class DPCLot extends Lot {

    public static double getCost( double curentLevel ) {
        return 5 * (pow(1.062, curentLevel + 1) - pow(1.062, curentLevel)) / 0.062;
    }

    public void buyLot() {
        if (currentLVL > 10) {
            IMP_Bonus = (currentLVL - 10) % 10;
        }
        else
            IMP_Bonus = 1;
        MainActivity.Credits -= getCost(currentLVL);
        MainActivity.DPC = currentLVL * IMP_Bonus;
    }
    DPCLot(double ImprovementBonus, double CurrentLevel) {
        IMP_Bonus = ImprovementBonus;
        currentLVL = CurrentLevel;
    }

}
