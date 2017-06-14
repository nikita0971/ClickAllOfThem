package com.example.myapplication.Lots;

import com.example.myapplication.MainActivity;

import static java.lang.Math.min;
import static java.lang.Math.pow;

public class DPSLot extends Lot {

    private static int heroUnlockOrder;
    private static double purchaseCost;

    public static int getHeroUO() {
        return heroUnlockOrder;
    }

    public static double getPC() {
        return purchaseCost;
    }

    public static double getCost(double curentLevel){
        return purchaseCost / 10 * pow(1.082, curentLevel);
    }

    public static void buyLot( double Credits ) {
        IMP_Bonus = (double)(((int)currentLVL / 10) + 1);
        MainActivity.Credits -= getCost(currentLVL);
        purchaseCost = getCost(currentLVL);
        heroUnlockOrder++;
        MainActivity.DPS = purchaseCost / 10 * pow(1 - 23 / 1000 * min(heroUnlockOrder, 34), min(heroUnlockOrder, 34)) * IMP_Bonus;
    }

    DPSLot( double ImprovementBonus, double CurrentLevel, int HeroUnlockOrder, double PurchaseCost ) {
        IMP_Bonus = ImprovementBonus;
        currentLVL = CurrentLevel;
        heroUnlockOrder = HeroUnlockOrder;
        purchaseCost = PurchaseCost;
    }


}
