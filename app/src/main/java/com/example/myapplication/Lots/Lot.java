package com.example.myapplication.Lots;


abstract class Lot {
    static double purchaseCost;
    static double currentLVL;
    static double IMP_Bonus;
    static long ID;

    public double getPurchaseCost() { return purchaseCost; }

    public double getCurrentLVL() {
        return currentLVL;
    }

    public double getIMP_Bonus() {
        return IMP_Bonus;
    }

    public double getID() { return ID; }
}



