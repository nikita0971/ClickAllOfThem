package com.example.myapplication;

import java.util.Date;

class Time {
    static long getTime() {
        Date date = new Date();

        return date.getTime() / 1000;
    }
}