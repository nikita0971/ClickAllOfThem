package com.example.myapplication.Lots;

/**
 * Created by Никита on 14.06.2017.
 */

public class Array_of_Lots {
    private static Lot Lots[];

    Lot[] Array_of_Lots() {
        Lots[0] = new DPCLot(1, 0);
        for (int i = 0; i < 5; i++) {
            //Lots[i+1] = new DPSLot(1, 2);
        }
        return Lots;
    }
}
