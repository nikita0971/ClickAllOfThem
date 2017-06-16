package com.example.myapplication.Lots;

import com.example.myapplication.MainActivity;

import static java.lang.Math.min;
import static java.lang.Math.pow;

public class DPSLot {

    private double currentLVL;
    private double purchaseCost;
    private double IMP_Bonus;
    private int heroUnlockOrder;

    public double getPurchaseCost() { return purchaseCost; }

    public double getCurrentLVL() {
        return currentLVL;
    }

    public double getIMP_Bonus() {
        return IMP_Bonus;
    }


    public  int getHeroUO() {
        return heroUnlockOrder;
    }

    public double getCost(){
        return purchaseCost * pow(1.082, currentLVL);
    }

    public void buyLot() {
        if (MainActivity.Credits < purchaseCost)
            return;
        else
            currentLVL++;
        if (currentLVL >= 20 && (currentLVL - 10) % 10 == 0)
            IMP_Bonus = pow(2, (currentLVL - currentLVL % 10 - 10) / 10);
        MainActivity.Credits -= getCost();
        purchaseCost = getCost();
        MainActivity.DPS = purchaseCost / 10 * pow(1 - min(heroUnlockOrder, 34) * 23 / 1000, min(heroUnlockOrder, 34)) * IMP_Bonus;
    }

    public double getDMG(){
        currentLVL++;
        double PC = purchaseCost / 10 * pow(1 - min(heroUnlockOrder, 34) * 23 / 1000, min(heroUnlockOrder, 34)) * IMP_Bonus - MainActivity.DPS;
        currentLVL--;
        return PC;
    }

    public DPSLot( double ImprovementBonus, double CurrentLevel, int HeroUnlockOrder, double PurchaseCost ) {
        IMP_Bonus = ImprovementBonus;
        currentLVL = CurrentLevel;
        heroUnlockOrder = HeroUnlockOrder;
        purchaseCost = PurchaseCost;
    }


}
