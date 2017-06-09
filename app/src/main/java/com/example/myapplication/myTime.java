package com.example.myapplication;

import android.text.format.Time;
/**
 * Created by Никита on 08.06.2017.
 */

public class myTime {
    double
            globalTime,         // Global time in seconds     (without pauses)
            globalDeltaTime,    // Interframe time in seconds (without pauses)
            Time,               // Time in seconds
            deltaTime,          // Interframe time in seconds
            FPS;                // Frame per second value
    static long
            startTime,          // System start time
            oldTime,            // Time of previous frame
            pauseTime,          // Total pause time
            oldFPSTime,         // Old time for FPS measure
            timeFreq;           // Timer precision
    static int
            frameCounter;       // Frame counter for FPS measure
    boolean
            isPause;            // Pause flag
    void update() {
        java. Time = Runtime();
    }
}
