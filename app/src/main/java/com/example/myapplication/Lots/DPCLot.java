package com.example.myapplication.Lots;

import com.example.myapplication.MainActivity;

import static java.lang.Math.pow;

public class DPCLot {

    static double purchaseCost;
    static double currentLVL;
    static double IMP_Bonus;

    public double getPurchaseCost() { return purchaseCost; }

    public double getCurrentLVL() {
        return currentLVL;
    }

    public double getIMP_Bonus() {
        return IMP_Bonus;
    }

    public static double getCost( double curentLevel ) {
        return 5 * (pow(1.062, curentLevel + 1) - pow(1.062, curentLevel)) / 0.062;
    }

    public static double getDPC() {
        return MainActivity.DPC;
    }

    public void buyLot() {
        if (MainActivity.Credits < getCost(currentLVL))
            return;
        else
            currentLVL++;

        if (currentLVL >= 20 && (currentLVL - 10 ) % 10 == 0)
            IMP_Bonus = pow(2, (currentLVL - currentLVL % 10 - 10) / 10);

        MainActivity.Credits -= getCost(currentLVL);
        MainActivity.DPC = currentLVL * IMP_Bonus;
    }

    public double getDMG() {
        return (currentLVL + 1) * IMP_Bonus - MainActivity.DPC;
    }
    public DPCLot(double ImprovementBonus, double CurrentLevel, double PurchaseCost) {
        IMP_Bonus = ImprovementBonus;
        currentLVL = CurrentLevel;
        purchaseCost = PurchaseCost;
    }

}
