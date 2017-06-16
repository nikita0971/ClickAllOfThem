package com.example.myapplication;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.myapplication.Lots.DPCLot;
import com.example.myapplication.Lots.DPSLot;

/**
 * Created by Никита on 16.06.2017.
 */

public class App extends Application{
    private static DPCLot LOT1 = new DPCLot(1, 1, 10);
    private static DPSLot LOT2 = new DPSLot(1, 0, 1, 30),
                          LOT3 = new DPSLot(1, 0, 2, 180),
                          LOT4 = new DPSLot(1, 0, 3, 800),
                          LOT5 = new DPSLot(1, 0, 4, 4000),
                          LOT6 = new DPSLot(1, 0, 5, 24000);

    public static DPCLot getLOT1() {
        return LOT1;
    }

    public static DPSLot getLOT2() {
        return LOT2;
    }

    public static DPSLot getLOT3() {
        return LOT3;
    }

    public static DPSLot getLOT4() {
        return LOT4;
    }

    public static DPSLot getLOT5() {
        return LOT5;
    }

    public static DPSLot getLOT6() {
        return LOT6;
    }
}
